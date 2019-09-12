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
import lejos.hardware.Button;
import java.io.File;
//import lejos.hardware.Sound;
import lejos.hardware.Sound;
import lejos.hardware.Audio;

public class B�ndv2{

  public static void main (String[] arg) throws Exception  {
	  	EV3 ev3 = (EV3) BrickFinder.getLocal();
		TextLCD lcd = ev3.getTextLCD();
		Keys keys = ev3.getKeys();

		//B og C = Motor til ene b�ndet
		//A Til det ene b�ndet
		//D til armen


		lcd.drawString("Trykk p� knappen for � starte programmet.", 10,10);
		Button.waitForAnyPress();
		lcd.clear();
		//File sang = new File("yeet.wav");
		//Sound.playSample(sang, 200);
		Motor.B.setSpeed(100); //B�ndet med to
		//Motor.C.setSpeed(270); //B�ndet med to
		//Motor.A.setSpeed(320); //Det ene b�ndet
		//Audio audio = ev3.getAudio();

		boolean kjor = true;
		while(kjor) {
			//B�ndet kj�rer;
			//Motor.C.forward();
			Motor.B.backward();
			//Motor.A.backward();





		}

}
}
