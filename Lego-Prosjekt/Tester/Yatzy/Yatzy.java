import lejos.hardware.motor.*;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.port.Port;
import lejos.hardware.Brick;
import lejos.hardware.BrickFinder;
import lejos.robotics.SampleProvider;
import lejos.hardware.Button;
import lejos.hardware.sensor.EV3TouchSensor;


class Yatzy{
	public int poeng;

	public Yatzy(int poeng){
		this.poeng = poeng;
	}

	public int getPoeng(){
		return poeng;
	}

	public void kjorBand() {
		Motor.A.setSpeed(100);
		Motor.B.setSpeed(250);
		Motor.C.setSpeed(250);
		Motor.C.forward();
		Motor.B.backward();
		Motor.A.backward();
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

	public int trillTerninger(float[] fargeSample, SampleProvider fargeLeser ) throws Exception{


		double farge = 0;
		for (int i = 0; i < 50; i++){
			fargeLeser.fetchSample(fargeSample, 0);
			farge += fargeSample[0]*100;
		}
		farge = farge / 100 + 5;
		System.out.println(farge);
		Thread.sleep(200);
		if(farge > 205 && farge < 209){
			poeng++;
			System.out.println(farge);
			Thread.sleep(1000);
		}
		if (farge > 609 && farge < 612) {
			System.out.println(farge);
			poeng++;
			Thread.sleep(1000);
		}
		if (farge > 710 && farge < 713) {
			System.out.println(farge);
			//poeng++;
			Thread.sleep(1000);
		}
		if (farge > 1316 && farge < 1320) {
			System.out.println(farge);
			poeng++;
			Thread.sleep(1000);
		}
		if(farge > 104 && farge < 108) {
			System.out.println(farge);
			poeng++;
			Thread.sleep(1000);
		}
		if(farge > 3 && farge < 7) {
			System.out.println(farge);
			poeng++;
			Thread.sleep(1000);
		}


		return poeng;

	}

public static void main(String[]args) throws Exception{
		Brick brick = BrickFinder.getDefault();
		Port s1 = brick.getPort("S1");
		Port s2 = brick.getPort("S2");

		EV3ColorSensor fargesensor = new EV3ColorSensor(s1);
		SampleProvider fargeLeser = fargesensor.getColorIDMode();
		float[] fargeSample = new float[fargeLeser.sampleSize()];

		SampleProvider trykkSensor = new EV3TouchSensor(s2);
		float[] trykkSample = new float[trykkSensor.sampleSize()]; // tabell som inneholder avlest verdi

		boolean fortsett = true;
		Yatzy A = new Yatzy(0);
		Yatzy B = new Yatzy(0);

		Button.waitForAnyPress();

		int poeng = 0;
		A.kjorBand();
		int teller = 0;


		while (fortsett) {
		A.trillTerninger(fargeSample, fargeLeser);
		System.out.println("Poeng: " + A.getPoeng());
		boolean knapp = A.sjekkKnapp(trykkSample, trykkSensor);
		if (knapp) {
			A.kjorArm();
		}


	}
	}
}

