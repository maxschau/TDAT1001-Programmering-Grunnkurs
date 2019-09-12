import java.awt.*;
import javax.swing.*;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.awt.GLCanvas;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


import com.jogamp.opengl.util.FPSAnimator;
import com.jogamp.opengl.util.gl2.GLUT;


    public class NewClass extends GLCanvas implements GLEventListener {
        // constants
        private static String TITLE = "Øving 15";
        private static final int CANVAS_WIDTH = 1200;  // width of the drawable
        private static final int CANVAS_HEIGHT = 800; // height of the drawable
        private static final int FPS = 60; // animator's target frames per second

        private int rotAngle = 0;
        float zoomZ = 5f;
        double eyeX = 0.0;
        double eyeZ = 7.0;

        float rotate_l_arm = 0f;
        float rotate_r_arm = 0f;
        float rotate_l_foot = 0f;
        float rotate_r_foot = 0f;
        float rotate_head = 0f;


        int animationSpeed = 2;
        int directionCounter = 60;
        int direction = 1;

        double camAngle = 10.0;

        boolean walkAnimation = false;
        boolean rotateCamera = false;

        private GLU glu;  // for the GL Utility

        /** Constructor to setup the GUI for this Component */
        public NewClass() {
            this.addGLEventListener(this);
            this.addKeyListener(new RotateKeyListener()); //listener for keyboard
        }



        public void init(GLAutoDrawable drawable) {
            GL2 gl = drawable.getGL().getGL2();      // get the OpenGL graphics context
            glu = new GLU();                         // get GL Utilities
            gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f); // set background (clear) color
            gl.glEnable(GL2.GL_DEPTH_TEST);           // enables depth testing
            gl.glHint(GL2.GL_PERSPECTIVE_CORRECTION_HINT, GL2.GL_NICEST); // best perspective correction
        }


        public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
            GL2 gl = drawable.getGL().getGL2();  // get the OpenGL 2 graphics context

            if (height == 0) height = 1;   // prevent divide by zero
            float aspect = (float)width / height;

            //Set the view port (display area) to cover the entire window
            gl.glViewport(0, 0, width, height);



            // Setup perspective projection, with aspect ratio matches viewport
            gl.glMatrixMode(GL2.GL_PROJECTION);  // choose projection matrix
            gl.glLoadIdentity();             // reset projection matrix
            glu.gluPerspective(45.0, aspect, 0.1, 100.0); // fovy, aspect, zNear, zFar
            //   glu.gluLookAt(0,0,5,0,0,0,0,1,0);

            // Enable the model-view transform
            gl.glMatrixMode(GL2.GL_MODELVIEW);
            gl.glLoadIdentity(); // reset
        }


        GLUT glut = new GLUT();

        float rotateHeadY = 0f;

        public void display(GLAutoDrawable drawable) {

            GL2 gl = drawable.getGL().getGL2();  // get the OpenGL 2 graphics context

            gl.glClear(GL2.GL_COLOR_BUFFER_BIT | GL2.GL_DEPTH_BUFFER_BIT); // clear color and depth buffers
            gl.glLoadIdentity();  // reset the model-view matrix
           // gl.glRotated(rotAngle, 0f, 0f, 6.0f);//rotate around x,y,z axis
            gl.glTranslatef(0f,0f,0f);
            //draw cube by using rectangles (would be easier with line loop/quads)

            glu.gluLookAt(eyeX,0,eyeZ,0,0,0,0,1,0);

            drawHead(gl);
            drawChest(gl);
            drawArms(gl);
            drawLegs(gl);

            if (rotateCamera == true) {

                camAngle = camAngle + 0.05;
                eyeX = Math.cos(camAngle) * 30;
                eyeZ = Math.sin(camAngle) * 30;

               //  System.out.println("camAngle: " + camAngle + "  eyeX: " +  eyeX + "  eyeZ: " + eyeZ);

            }


            if (walkAnimation == true) {
                System.out.println("Går : "+ directionCounter);

                if(directionCounter == 60) { direction=-1; }
                if(directionCounter == -1) { direction=1; }

                if(directionCounter >= 30) {
                    animationSpeed = -2;
                } else {
                    animationSpeed = 2;
                }

                directionCounter = directionCounter + direction;

                    rotate_l_arm = rotate_l_arm + animationSpeed;
                    rotate_l_foot = rotate_l_foot - animationSpeed;

                    rotate_r_arm = rotate_r_arm - animationSpeed;
                    rotate_r_foot = rotate_r_foot + animationSpeed;

                    rotate_head = rotate_head - animationSpeed;



            } else {
                rotate_l_arm = 0f;
                rotate_r_arm = 0f;
                rotate_l_foot = 0f;
                rotate_r_foot = 0f;
                rotate_head = 0f;

                animationSpeed = 2;
                directionCounter = 60;
                direction = 1;
            }



        }


        private void drawHead(GL2 gl) {

            gl.glPushMatrix();
            gl.glTranslatef(0.0f, 1.8f, -9.0f);     // T
            gl.glRotatef(rotate_head, 0,1, 0);
            glut.glutWireCube(1.8f);
            gl.glPopMatrix();
        }

        private void drawChest(GL2 gl) {
            gl.glPushMatrix();
            gl.glTranslatef(0.0f, -0.9f, -9.0f);     // T
            gl.glScalef(1.4f,1.8f,1f);
            glut.glutWireCube(2.0f);
            gl.glPopMatrix();
        }

       private void drawArms(GL2 gl) {
            gl.glPushMatrix();
            gl.glTranslatef(-2.0f, -2.0f, -9.0f);     // T
            gl.glTranslatef(0f,2.3f,0f);
            gl.glRotatef(rotate_r_arm, 0f,0f, 0f);
            gl.glTranslatef(0f,-2.3f,0f);
            gl.glScalef(1f,5f,1f);
            glut.glutWireCube(1f);
            gl.glPopMatrix();

            gl.glPushMatrix();
            gl.glTranslatef(2.0f, -2.0f, -9.0f);     // T
            gl.glTranslatef(0f,2.3f,0f);
            gl.glRotatef(rotate_l_arm, 0f,0f, 0f);
            gl.glTranslatef(0f,-2.3f,0f);
            gl.glScalef(1f,5f,1f);
            glut.glutWireCube(1f);
            gl.glPopMatrix();
        }

        private void drawLegs(GL2 gl) {
            gl.glPushMatrix();
            gl.glTranslatef(-0.7f, -5.0f, -9.0f);     // T
            gl.glTranslatef(0f,2.3f,0f);
            gl.glRotatef(rotate_r_foot, 0f,0f, 0f);
            gl.glTranslatef(0f,-2.3f,0f);
            gl.glScalef(1.2f,5f,1.2f);
            glut.glutWireCube(1f);
            gl.glPopMatrix();

            gl.glPushMatrix();
            gl.glTranslatef(0.7f, -5.0f, -9.0f);     // T
            gl.glTranslatef(0f,2.3f,0f);
            gl.glRotatef(rotate_l_foot, 0f,0f, 0f);
            gl.glTranslatef(0f,-2.3f,0f);
            gl.glScalef(1.2f,5f,1.2f);
            glut.glutWireCube(1f);
            gl.glPopMatrix();
        }

        private void kubeSkalering(GL2 gl) {
            gl.glScalef(1.5f,1.5f,0.8f);
            return;
        }



        private void kubeRotering() {
            // gl_head.glRotated(25.0, 0.0f, 1.0f, 0.0f);
            return;
        }

        /**
         * Called before the OpenGL context is destroyed. Release resource such as buffers.
         */
        public void dispose(GLAutoDrawable drawable) { }

/*        private class RotateKeyListener extends KeyAdapter {

            public void keyPressed(KeyEvent e) {

                if (e.getKeyChar() == 'w') {
                    rotate_head++;
                    System.out.println("trykker x");
                } else if (e.getKeyChar() == 's') {
                    //x--;
                } else if (e.getKeyChar() == 'a') {
                   // y++;
                } else if (e.getKeyChar() == 'd') {
                   //  y--;
                } else if (e.getKeyChar() == 'q') {
                    rotate_head=0;
                    // mY=0;

                }


                // Rendering.this.repaint();//repaint our canvas
            }
        }
*/

       private class RotateKeyListener extends KeyAdapter{

            public void keyPressed(KeyEvent e) {
                //accept any key

                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    zoomZ += 1;//
                    NewClass.this.repaint();//repaint our canvas
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    zoomZ -= 1;//
                    NewClass.this.repaint();//repaint our ca
                }

                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                  //   rotateCamera = true;
                    NewClass.this.repaint();//repaint our canvas
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    eyeX -= 0.3f;//
                    NewClass.this.repaint();//repaint our canvas
                }
                if (e.getKeyCode() == KeyEvent.VK_W) {
                    walkAnimation = true;
                    // System.out.println("Trykker w");
                    NewClass.this.repaint();//repaint our canvas

                }

                if (e.getKeyCode() == KeyEvent.VK_R) {
                    rotateCamera = true;
                    // System.out.println("Trykker r");
                    NewClass.this.repaint();//repaint our canvas

                }
            }

            public void keyReleased(KeyEvent e){
                if (e.getKeyCode() == KeyEvent.VK_W) {
                    walkAnimation = false;
                    // resetAnimation();

                }
                if (e.getKeyCode() == KeyEvent.VK_R) {
                    rotateCamera = false;
                    // resetAnimation();

                }
            }
        }


        private void animateWalk() {
            System.out.print("går og ");
        }






        /** The entry main() method to setup the top-level JFrame with our OpenGL canvas inside */
        public static void main(String[] args) {
            GLCanvas canvas = new NewClass();
            canvas.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));

            final JFrame frame = new JFrame(); // Swing's JFrame or AWT's Frame

            final FPSAnimator animator = new FPSAnimator(canvas, FPS, true);


            frame.getContentPane().add(canvas);
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//stop program
            frame.setTitle(TITLE);
            frame.pack();
            frame.setVisible(true);
            animator.start(); // start the animation loop


            //for(int i=1; i<1000; i++) {
               //  CreateRobot.gl_head.glRotated(25.0, 0.0f, 1.0f, 0.0f);
            // }
        }



}