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


public class Vaskebil {
	public static void main (String[] arg) throws Exception  {

		Brick brick = BrickFinder.getDefault();
		Port s3 = brick.getPort("S3"); // lydsensor

		EV3 ev3 = (EV3) BrickFinder.getLocal();
		TextLCD lcd = ev3.getTextLCD();
		Keys keys = ev3.getKeys();

		NXTSoundSensor lydsensor = new NXTSoundSensor(s3);
		SampleProvider lydLeser = lydsensor.getDBMode();
    	float[] lydSample = new float[lydLeser.sampleSize()];


		lcd.drawString("Trykk for starte", 0, 1);
		keys.waitForAnyPress(); //Starter ved trykk på knapp
		lcd.clear(); //Rengjør skjermen
		lcd.drawString("Lag lyd", 0, 1);
		boolean ikkeAvslutt = true;
		 while (ikkeAvslutt) {

		if (lydSample != null && lydSample.length > 0) {
			lydsensor.fetchSample(lydSample, 0);
			//System.out.println(lydSample[0]); //S4jekker lydnivået

			if (lydSample[0] > 0.95) {
				lcd.clear();
				System.out.println("Avslutter");
				Thread.sleep(5000);
				ikkeAvslutt = false;
			}

	}


		}


		} //main
}//class
