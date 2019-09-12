import lejos.hardware.motor.*;
import lejos.hardware.lcd.*;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.hardware.sensor.EV3GyroSensor;
import lejos.hardware.sensor.NXTTouchSensor;
import lejos.hardware.sensor.NXTLightSensor;
import lejos.hardware.sensor.NXTColorSensor;
import lejos.hardware.sensor.NXTSoundSensor;
import lejos.hardware.sensor.NXTUltrasonicSensor;
import lejos.hardware.port.Port;
import lejos.hardware.Brick;
import lejos.hardware.BrickFinder;
import lejos.hardware.ev3.EV3;
import lejos.hardware.Keys;
import lejos.hardware.sensor.SensorModes;
import lejos.robotics.SampleProvider;
import lejos.hardware.sensor.*;


public class TestSensor {
	public static void main (String[] arg) throws Exception  {

		Brick brick = BrickFinder.getDefault();
		Port s2 = brick.getPort("S2"); // trykksensor

		EV3 ev3 = (EV3) BrickFinder.getLocal();
		TextLCD lcd = ev3.getTextLCD();
		Keys keys = ev3.getKeys();

		/* Definerer en trykksensor */
		SampleProvider trykksensor = new EV3TouchSensor(s2);
		float[] trykkSample = new float[trykksensor.sampleSize()]; // tabell som inneholder avlest verdi

		lcd.drawString("Trykk for starte", 0, 1);
		keys.waitForAnyPress(); //Starter ved trykk på knapp
		lcd.clear(); //Rengjør skjermen
		lcd.drawString("Trykk på sensor", 0, 1);

		if (trykkSample != null && trykkSample.length > 0){
			  trykksensor.fetchSample(trykkSample, 0);
			  if (trykkSample[0] > 0){
				  System.out.println("Avslutter");
				  Thread.sleep(20000);
			 }

		}
		}
}
