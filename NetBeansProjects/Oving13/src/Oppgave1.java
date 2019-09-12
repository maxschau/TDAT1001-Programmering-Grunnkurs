
import static com.jogamp.opengl.GL.GL_POINTS;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.glu.GLU;
import java.awt.Dimension;
import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maxto
 */
public class Oppgave1 extends GLCanvas implements GLEventListener {
     // constants
   private static String TITLE = "Tittel på vindu";
   private static final int CANVAS_WIDTH = 320;  // width of the drawable
   private static final int CANVAS_HEIGHT = 240; // height of the drawable
  
   // Setup OpenGL Graphics Renderer 
   private GLU glu;  // for the GL Utility
   
   /** Constructor to setup the GUI for this Component */
   public Oppgave1() {
      this.addGLEventListener(this);
   }
   
// ------ Implement methods declared in GLEventListener (init,reshape,display,dispose)          

   /**
    * Called immediately after the OpenGL context is initialized. Can be used 
    * to perform one-time initialization. Run only once.
    */
   public void init(GLAutoDrawable drawable) {
      GL2 gl = drawable.getGL().getGL2();      // get the OpenGL graphics context
      glu = new GLU();                         // get GL Utilities
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

   /**
    * Called by OpenGL for drawing
    */
   public void display(GLAutoDrawable drawable) {
      GL2 gl = drawable.getGL().getGL2();  // get the OpenGL 2 graphics context
      gl.glClear(GL2.GL_COLOR_BUFFER_BIT | GL2.GL_DEPTH_BUFFER_BIT); // clear color and depth buffers
      gl.glLoadIdentity();  // reset the model-view matrix
      
      double[] points = {0.0,2.0,0.0,1.5,1.5,0.0,2.0,0.0,0.0,1.5,-1.5,0.0,0.0,-2.0,0.0,-1.5,-1.5,0.0,-2.0,0.0,0.0,-1.5,1.5,0.0};
 
      //GL_POINT:
      /*gl.glBegin(GL2.GL_POINTS);
      gl.glVertex3dv(points,0);
      gl.glVertex3dv(points,3);
      gl.glVertex3dv(points,6);
      gl.glEnd();
      */
      
      //GL_LINES:
      gl.glTranslatef(-10.0f, 0.0f, -30.0f); 
      gl.glBegin(GL2.GL_LINES);
      gl.glVertex3dv(points,0);
      gl.glVertex3dv(points,3);
      gl.glVertex3dv(points,6);
      gl.glVertex3dv(points,9);
      gl.glVertex3dv(points,12);
      gl.glVertex3dv(points,15);
      gl.glVertex3dv(points,18);
      gl.glVertex3dv(points,21);
      gl.glEnd();
      
      
      //GL_LINE_STRIP:
      gl.glTranslatef(5f, 0.0f, -0.0f); 
      gl.glBegin(GL2.GL_LINE_STRIP);
      gl.glVertex3dv(points,0);
      gl.glVertex3dv(points,3); 
      gl.glVertex3dv(points,6);
      gl.glVertex3dv(points,9);
      gl.glVertex3dv(points,12);
      gl.glVertex3dv(points,15);
      gl.glVertex3dv(points,18);
      gl.glVertex3dv(points,21);
      gl.glEnd();
      
      
      
      //GL_LINE_STRIP:
      gl.glTranslatef(5.0f, 0.0f, -0.0f); 
      gl.glBegin(GL2.GL_LINE_LOOP);
      gl.glVertex3dv(points,0);
      gl.glVertex3dv(points,3); 
      gl.glVertex3dv(points,6);
      gl.glVertex3dv(points,9);
      gl.glVertex3dv(points,12);
      gl.glVertex3dv(points,15);
      gl.glVertex3dv(points,18);
      gl.glVertex3dv(points,21);
      gl.glEnd();
      
      
      
      //GL TRIANGLES:
      gl.glTranslatef(5.0f, 0.0f, -0.0f); 
      gl.glBegin(GL2.GL_TRIANGLES);
      gl.glVertex3dv(points,0);
      gl.glVertex3dv(points,3); 
      gl.glVertex3dv(points,6);
      gl.glVertex3dv(points,9);
      gl.glVertex3dv(points,12);
      gl.glVertex3dv(points,15);
      gl.glVertex3dv(points,18);
      gl.glVertex3dv(points,21);
      gl.glEnd();
      
      //GL TRIANGLES:
      gl.glTranslatef(5.0f, 0.0f, -0.0f); 
      gl.glBegin(GL2.GL_TRIANGLE_STRIP);
      gl.glVertex3dv(points,0);
      gl.glVertex3dv(points,3); 
      gl.glVertex3dv(points,6);
      gl.glVertex3dv(points,9);
      gl.glVertex3dv(points,12);
      gl.glVertex3dv(points,15);
      gl.glVertex3dv(points,18);
      gl.glVertex3dv(points,21);
      gl.glEnd();
      
      //GL_TRIANGLE_FAN:
      gl.glTranslatef(5.0f, 0.0f, -0.0f); 
      gl.glBegin(GL2.GL_TRIANGLE_FAN);
      gl.glVertex3dv(points,0);
      gl.glVertex3dv(points,3); 
      gl.glVertex3dv(points,6);
      gl.glVertex3dv(points,9);
      gl.glVertex3dv(points,12);
      gl.glVertex3dv(points,15);
      gl.glVertex3dv(points,18);
      gl.glVertex3dv(points,21);
      gl.glEnd();
      
      //GL_QUADS:
      gl.glTranslatef(5.0f, 0.0f, -0.0f); 
      gl.glBegin(GL2.GL_QUADS);
      gl.glVertex3dv(points,0);
      gl.glVertex3dv(points,3); 
      gl.glVertex3dv(points,6);
      gl.glVertex3dv(points,9);
      gl.glVertex3dv(points,12);
      gl.glVertex3dv(points,15);
      gl.glVertex3dv(points,18);
      gl.glVertex3dv(points,21);
      gl.glEnd();
      
      // GL_QUAD_STRIP:
      gl.glTranslatef(5.0f, 0.0f, -0.0f); 
      gl.glBegin(GL2.GL_QUAD_STRIP);
      gl.glVertex3dv(points,0);
      gl.glVertex3dv(points,3); 
      gl.glVertex3dv(points,6);
      gl.glVertex3dv(points,9);
      gl.glVertex3dv(points,12);
      gl.glVertex3dv(points,15);
      gl.glVertex3dv(points,18);
      gl.glVertex3dv(points,21);
      gl.glEnd();
      
       //  GL_POLYGON:
      gl.glTranslatef(5.0f, 0.0f, -0.0f); 
      gl.glBegin(GL2.GL_POLYGON);
      gl.glVertex3dv(points,0);
      gl.glVertex3dv(points,3); 
      gl.glVertex3dv(points,6);
      gl.glVertex3dv(points,9);
      gl.glVertex3dv(points,12);
      gl.glVertex3dv(points,15);
      gl.glVertex3dv(points,18);
      gl.glVertex3dv(points,21);
      gl.glEnd();
      
      //GL_POINTS:
      gl.glTranslatef(5.0f, 0.0f, -0.0f); 
      gl.glBegin(GL2.GL_POINTS);
      gl.glVertex3dv(points,0);
      gl.glVertex3dv(points,3); 
      gl.glVertex3dv(points,6);
      gl.glVertex3dv(points,9);
      gl.glVertex3dv(points,12);
      gl.glVertex3dv(points,15);
      gl.glVertex3dv(points,18);
      gl.glVertex3dv(points,21);
      gl.glEnd();
      
      
      
      
      

   }
      

   /** 
    * Called before the OpenGL context is destroyed. Release resource such as buffers. 
    */
   public void dispose(GLAutoDrawable drawable) { }
   
   /** The entry main() method to setup the top-level JFrame with our OpenGL canvas inside */
   public static void main(String[] args) {
       GLCanvas canvas = new Oppgave1();
       canvas.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
       
       final JFrame frame = new JFrame(); // Swing's JFrame or AWT's Frame
       frame.getContentPane().add(canvas);
       frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//stop program
       frame.setTitle(TITLE);
       frame.pack();
       frame.setVisible(true);      
   }
}