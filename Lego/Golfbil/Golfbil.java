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

public class Golfbil {
public static void main (String[] arg) throws Exception  {
		try{

			Brick brick = BrickFinder.getDefault();
    		Port s2 = brick.getPort("S2"); // trykksensor
    		Port s3 = brick.getPort("s3"); // lydsensor
    		Port s4 = brick.getPort("s4"); //fargesensor

			EV3 ev3 = (EV3) BrickFinder.getLocal();
			TextLCD lcd = ev3.getTextLCD();
			Keys keys = ev3.getKeys();

			/* Definerer en trykksensor */
			SampleProvider trykksensor = new EV3TouchSensor(s2);
			float[] trykkSample = new float[trykksensor.sampleSize()]; // tabell som inneholder avlest verdi

			/*Definerer en lydsensor*/
			SampleProvider lydsensor = new NXTSoundSensor(s3);
			float[] lydSample = new float[lydsensor.sampleSize()]; // tabell som inneholder avlest verdi

			/*Definerer en fargesensor */
			SampleProvider fargesensor = new EV3ColorSensor(s4);
			float[] fargeSample = new float[fargesensor.sampleSize()]; //tabell som inneholder avlest verdi



			boolean fortsett  = true;
			int teller = 0;

			while (teller <= 3) {
			Motor.A.setSpeed(300); //Bak venstre
			Motor.C.setSpeed(300); //Bak høyre

			Motor.A.forward();
			Motor.C.forward();

	  			if (trykkSample != null && trykkSample.length > 0){
	  				trykksensor.fetchSample(trykkSample, 0);
	  				if (trykkSample[0] > 0){
						teller ++;
						Motor.A.backward();
						Motor.C.backward();
						Thread.sleep(2000);

						Motor.A.backward();
						Motor.C.stop();
						Thread.sleep(800);

	 				}
  	 			}else System.out.println("Sample er null eller 0");

  			} // while

		}catch(Exception e){
			System.out.println("Feil: " + e);
		} //try-catch
	} // main
} // class SensorTest