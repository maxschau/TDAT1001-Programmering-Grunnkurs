//package jogl2;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import com.jogamp.opengl.GL;
import java.awt.*;
import javax.swing.*;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.util.FPSAnimator;
import com.jogamp.opengl.util.gl2.GLUT;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maxto
 */
public class Oving15 extends GLCanvas implements GLEventListener {
     // constants
   private static String TITLE = "Tittel på vindu";
   private static final int CANVAS_WIDTH = 320;  // width of the drawable
   private static final int CANVAS_HEIGHT = 240; // height of the drawable
  
   // Setup OpenGL Graphics Renderer 
   private GLU glu;  // for the GL Utility
   
   private GLUT glut;
  
   
   /** Constructor to setup the GUI for this Component */
   public Oving15() {
      this.addGLEventListener(this);
      this.addKeyListener(new RotateKeyListener());
   }
   
// ------ Implement methods declared in GLEventListener (init,reshape,display,dispose)          

   /**
    * Called immediately after the OpenGL context is initialized. Can be used 
    * to perform one-time initialization. Run only once.
    */
   public void init(GLAutoDrawable drawable) {
      GL2 gl = drawable.getGL().getGL2();      // get the OpenGL graphics context
      glu = new GLU();  
      glut = new GLUT();
      // get GL Utilities
      gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f); // set background (clear) color
      gl.glEnable(GL2.GL_DEPTH_TEST);           // enables depth testing
      gl.glHint(GL2.GL_PERSPECTIVE_CORRECTION_HINT, GL2.GL_NICEST); // best perspective correction
   }

   /**
    * Handler for window re-size event. Also called when the drawable is 
    * first set to visible
    */
   public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
      GL2 gl = drawable.getGL().getGL2();  // get the OpenGL 2 graphics context

      if (height == 0) height = 1;   // prevent divide by zero     
      float aspect = (float)width / height;

      //Set the view port (display area) to cover the entire window
      //gl.glViewport(0, 0, width, height);

      // Setup perspective projection, with aspect ratio matches viewport
      gl.glMatrixMode(GL2.GL_PROJECTION);  // choose projection matrix
      gl.glLoadIdentity();             // reset projection matrix
      glu.gluPerspective(45.0, aspect, 0.1, 100.0); // fovy, aspect, zNear, zFar

      // Enable the model-view transform
      gl.glMatrixMode(GL2.GL_MODELVIEW);
      gl.glLoadIdentity(); // reset
      
   }
    
   private double gluLookAtX = 50;
   private double gluLookAtZ = 0;
   
   private class RotateKeyListener extends KeyAdapter{
       public void keyPressed(KeyEvent e){
           if (e.getKeyChar() == 'l'){
            if(gluLookAtZ == 0&& gluLookAtX == 50){
                gluLookAtZ = -50;
                gluLookAtX = 0;
            }else if(gluLookAtZ == -50 && gluLookAtX == 0){
                gluLookAtZ = 0;
                gluLookAtX = -50;
            } else if(gluLookAtZ == 0 && gluLookAtX == -50){
                gluLookAtZ = 50;
                gluLookAtX = 0;
            }  else {
                gluLookAtZ = 0;
                gluLookAtX = 50;
            }
           }
           if (e.getKeyChar() == 'w') {
               zVerdi += 10;
              // gluLookAtZ += 10;
           }
           //System.out.println(gluLookAtZ + "; " + gluLookAtX);
           Oving15.this.repaint();
       }
       }
   
      
   private void drawAllAxis(GL2 gl){
      gl.glColor3d(1, 0, 0);
      
      double[] tabell = {2,0,0};
      drawAxis(gl,tabell);
      
      gl.glColor3d(0, 1, 0);
      //y-akse
      
      double[] tabell2 = {0,2,0};
      drawAxis(gl,tabell2);
      
      gl.glColor3d(0, 0, 1);
      //z-akse

      double[] tabell3 = {0,0,2};
      drawAxis(gl,tabell3);
   }
    private void drawAxis(GL2 gl, double[] tabell){
      gl.glBegin(GL.GL_LINES);
        gl.glVertex3d(0, 0, 0);
        gl.glVertex3dv(tabell, 0);
      gl.glEnd(); 
   }
    
    double zVerdi = 0.0;
    
    
   public void flyttRobot(GL2 gl) { 
              // zVerdi += 10;
               //System.out.println("W TRYKKET");
               gl.glTranslated(0.0d, 0.0d, zVerdi);
               
     }
    
        

   /**
    * Called by OpenGL for drawing
    */
   public void display(GLAutoDrawable drawable) {
      GL2 gl = drawable.getGL().getGL2();  // get the OpenGL 2 graphics context
      gl.glClear(GL2.GL_COLOR_BUFFER_BIT | GL2.GL_DEPTH_BUFFER_BIT); // clear color and depth buffers
      gl.glLoadIdentity();  // reset the model-view matrix
      
      
      glu.gluLookAt(gluLookAtX, 0, gluLookAtZ + zVerdi, 0, 0, zVerdi, 0, 1, 0);
      
      drawAllAxis(gl);
      flyttRobot(gl);
      drawHead(gl);
      drawBody(gl);
      drawVenstreArm(gl);
      drawHoyreArm(gl);
      drawVenstreFot(gl);
      drawHoyreFot(gl);
      
     
   }
   
   public void drawHead(GL2 gl) {
      // gl.glPushMatrix();
       gl.glTranslated(0.0d, 10.0d, 0.0d);
       glut.glutSolidTeapot(3);
   }
   
   public void drawBody(GL2 gl) {
      // gl.glPushMatrix(); //
       gl.glTranslated(0.0d,-7.0d,0.0d);
       glut.glutSolidCylinder(4.0, 3, 10, 10);
       
   }
   
   public void drawVenstreArm(GL2 gl) {
      // gl.glPushMatrix();
       gl.glTranslated(-5.0d,-0.0d,0.0d);
       glut.glutWireCube(3);
   }
   public void drawHoyreArm(GL2 gl) {
      // gl.glPushMatrix();
       gl.glTranslated(10.0d,-0.0d,0.0d);
       glut.glutWireCube(3);
   }
   
   public void drawVenstreFot(GL2 gl) {
      // gl.glPushMatrix();
       gl.glTranslated(-2.0d,-4.0d,0.0d);
       glut.glutWireCube(3);
    }
      
   public void drawHoyreFot(GL2 gl) {
      // gl.glPushMatrix();
       gl.glTranslated(-5.0d,0.0d,0.0d);
       glut.glutWireCube(3);
    }
      

   /** 
    * Called before the OpenGL context is destroyed. Release resource such as buffers. 
    */
   public void dispose(GLAutoDrawable drawable) { }
   
   /** The entry main() method to setup the top-level JFrame with our OpenGL canvas inside */
   public static void main(String[] args) {
       GLCanvas canvas = new Oving15();
       canvas.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
       
       final JFrame frame = new JFrame(); // Swing's JFrame or AWT's Frame
       frame.getContentPane().add(canvas);
       frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//stop program
       frame.setTitle(TITLE);
       frame.pack();
       frame.setVisible(true);      
   }
}