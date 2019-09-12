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

public class Hitra {
public static void main (String[] arg) throws Exception{


			Brick brick = BrickFinder.getDefault();
    		//Port s2 = brick.getPort("S2"); // trykksensor
    		Port s3 = brick.getPort("S3"); // Fargesensor
    		Port s4 = brick.getPort("S4"); // lydsensor

			EV3 ev3 = (EV3) BrickFinder.getLocal();
			TextLCD lcd = ev3.getTextLCD();
			Keys keys = ev3.getKeys();

			Motor.A.setSpeed(150); //Bak venstre
			Motor.C.setSpeed(150); //Bak høyre
			Motor.B.setSpeed(150);

			EV3ColorSensor fargesensor = new EV3ColorSensor(s3); // ev3-fargesensor
    		SampleProvider fargeLeser = fargesensor.getMode("RGB");  // svart = 0.01..
    		float[] fargeSample = new float[fargeLeser.sampleSize()];  // tabell som innholder avlest verdi

    		NXTSoundSensor lydsensor = new NXTSoundSensor(s4);
    		SampleProvider lydLeser = lydsensor.getDBMode();
    		float[] lydSample = new float[lydLeser.sampleSize()];

			int teller = 0;

			// Beregn verdi for svart
			int svart = 0;
			for (int i = 0; i<100; i++){
				fargeLeser.fetchSample(fargeSample, 0);
				svart += fargeSample[0]* 100;
			}
			svart = svart / 100 + 5;
			lcd.drawInt(svart, 0, 3);
			Thread.sleep(2000);
			lcd.clear();

			while (teller < 5) {

				Motor.A.forward();
				Motor.C.forward();

				Motor.B.rotate(90);
				Motor.B.rotate(-90);



				fargeLeser.fetchSample(fargeSample, 0);
					if (fargeSample[0]*100 <= svart ){
						teller++;
						Motor.A.stop();
						Motor.C.stop();
						Motor.A.rotate(765);

						lcd.clear();
						lcd.drawString("Svart registrert", 0, 3);
					}
			}

					if (lydSample != null && lydSample.length > 0){
						lydsensor.fetchSample(lydSample, 0);

						if (lydSample[0] > 0.3){
							Motor.A.stop();
							Motor.C.stop();
							lcd.clear();
							lcd.drawString("Lyd registrert", 0, 3);
						}


  			} // while


	} // main
} // class SensorTest