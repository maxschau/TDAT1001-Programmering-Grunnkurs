/* FolgLinje.java  GS - 2012-01-20

 * Program som gjør at en enkel robot følger en sort linje
 * Du trenger en enkel robot som kan svinge
 * en lyssensor koblet til sensor 1 - pekende nedover
 * en trykksensor koblet til sensor 2 - pekende rett fram i gå retningen
 */
import lejos.hardware.motor.*;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.port.Port;
import lejos.hardware.Brick;
import lejos.hardware.BrickFinder;
import lejos.robotics.SampleProvider;
import lejos.hardware.Button;
import lejos.hardware.Sound;
import java.io.File;

public class JonasLyd{

  public static void main (String[] arg) throws Exception  {

	// Definerer sensorer:
	Brick brick = BrickFinder.getDefault();
    Port s1 = brick.getPort("S1"); // fargesensor
 	Port s2 = brick.getPort("S2"); // trykksensor




	Button.waitForAnyPress();
  	File sang = new File("Kjorlyd.wav");
    boolean fortsett = true;

    while (fortsett) {
  Sound.playSample(sang, 200);
  }



}
}
