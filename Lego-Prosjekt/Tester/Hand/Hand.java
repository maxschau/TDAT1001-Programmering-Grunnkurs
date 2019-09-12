import lejos.hardware.motor.*;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.port.Port;
import lejos.hardware.Brick;
import lejos.hardware.BrickFinder;
import lejos.robotics.SampleProvider;
import lejos.hardware.Button;
import lejos.hardware.sensor.EV3TouchSensor;


class Hand{
	public int poeng;

	public Hand(int poeng){
		this.poeng = poeng;
	}


	public void kjorArm() throws Exception {
		//Sound.playSample(sang, 200);
		Motor.D.setSpeed(180);
		Motor.D.rotate(-180);
		Thread.sleep(1000);
		Motor.D.setSpeed(150);
		Motor.D.rotate(180);
	}

	public boolean sjekkKnapp(float[] trykkSample, SampleProvider trykkSensor) {
		if (trykkSample != null && trykkSample.length > 0){
			trykkSensor.fetchSample(trykkSample, 0);
			 if (trykkSample[0] > 0){
				 return true;
			 }
		}
		return false;
	}



public static void main(String[]args) throws Exception{
		Brick brick = BrickFinder.getDefault();
		//Port s1 = brick.getPort("S1");
		Port s2 = brick.getPort("S2");

		/*EV3ColorSensor fargesensor = new EV3ColorSensor(s1);
		SampleProvider fargeLeser = fargesensor.getColorIDMode();
		float[] fargeSample = new float[fargeLeser.sampleSize()];
		*/

		SampleProvider trykkSensor = new EV3TouchSensor(s2);
		float[] trykkSample = new float[trykkSensor.sampleSize()]; // tabell som inneholder avlest verdi

		boolean fortsett = true;
		Hand A = new Hand(0);
		Hand B = new Hand(0);

		Button.waitForAnyPress();


		while (fortsett) {
		//A.trillTerninger(fargeSample, fargeLeser);
		//System.out.println("Poeng: " + A.getPoeng());
		boolean knapp = A.sjekkKnapp(trykkSample, trykkSensor);
		if (knapp) {
			A.kjorArm();
		}


	}
	}
}

