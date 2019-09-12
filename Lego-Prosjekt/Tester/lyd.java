/* FolgLinje.java  GS - 2012-01-20

 * Program som gj�r at en enkel robot f�lger en sort linje
 * Du trenger en enkel robot som kan svinge
 * en lyssensor koblet til sensor 1 - pekende nedover
 * en trykksensor koblet til sensor 2 - pekende rett fram i g� retningen
 */
import lejos.hardware.motor.*;
import lejos.hardware.lcd.*;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.port.Port;
import lejos.hardware.Brick;
import lejos.hardware.BrickFinder;
import lejos.robotics.SampleProvider;
import lejos.hardware.Sound;

public class lyd{

  public static void main (String[] arg) throws Exception  {
        TextLCD lcd = ev3.getTextLCD();
        EV3 ev3 = (EV3) BrickFinder.getLocal();


        final File soundFile = new File("r2d2.wav");
        lcd.drawString("Play: " + soundFile.getName(), 0, 1);
        Sound.playSample(soundFile, 100); // 100 ... volume





}
}
