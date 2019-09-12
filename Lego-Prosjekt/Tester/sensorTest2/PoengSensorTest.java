import lejos.hardware.motor.*;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.port.Port;
import lejos.hardware.Brick;
import lejos.hardware.BrickFinder;
import lejos.robotics.SampleProvider;
import lejos.hardware.Button;
import lejos.hardware.sensor.EV3TouchSensor;


class PoengSensorTest{
	public int poeng;

	public PoengSensorTest(int poeng){
		this.poeng = poeng;
	}

	public int getPoeng(){
		return poeng;
	}

	public void kjorBand() {
		Motor.B.setSpeed(150);
		Motor.B.backward();

	}

/*	public void kjorArm() throws Exception {
		//Sound.playSample(sang, 200);
		Motor.D.setSpeed(180);
		Motor.D.rotate(-180);
		Thread.sleep(1000);
		Motor.D.setSpeed(150);
		Motor.D.rotate(180);
	}*/

	public boolean sjekkKnapp(float[] trykkSample, SampleProvider trykkSensor) {
		if (trykkSample != null && trykkSample.length > 0){
			trykkSensor.fetchSample(trykkSample, 0);
			 if (trykkSample[0] > 0){
				 return true;
			 }
		}
		return false;
	}

	public int trillTerninger(float[] fargeSample, SampleProvider fargeLeser) throws Exception{
		double farge = 0.0;
		for (int i = 0; i < 100; i++){
			fargeLeser.fetchSample(fargeSample, 0);
			farge += fargeSample[0]*100;
		}
		farge = farge / 100 + 5;
		System.out.println(farge);
		//Thread.sleep(200);
		if(farge > 306 && farge < 309){
			poeng++;
			System.out.println("Gul");
			Thread.sleep(1000);
		}
		if (farge > 206 && farge < 208) {
			System.out.println("Blå");
			poeng++;
			Thread.sleep(1000);
		}
		if (farge > 610 && farge < 612) {
			System.out.println("Hvit");
			poeng++;
			Thread.sleep(1000);
		}
		if (farge > 4 && farge < 6) {
			System.out.println("Rød");
			poeng++;
			Thread.sleep(1000);
		}
		if(farge > 1316 && farge < 1319) {
			System.out.println("Svart");
			poeng++;
			Thread.sleep(1000);
		}
		if(farge > 104 && farge < 108) {
			System.out.println("Grønn");
			poeng++;
			Thread.sleep(1000);
		}


		return poeng;

	}

public static void main(String[]args) throws Exception{
		PoengSensorTest A = new PoengSensorTest(0);
		PoengSensorTest B = new PoengSensorTest(0);

		Brick brick = BrickFinder.getDefault();
		Port s1 = brick.getPort("S1");
		Port s2 = brick.getPort("S2");

		EV3ColorSensor fargesensor = new EV3ColorSensor(s1);
		SampleProvider fargeLeser = fargesensor.getColorIDMode();
		float[] fargeSample = new float[fargeLeser.sampleSize()];

		SampleProvider trykkSensor = new EV3TouchSensor(s2);
		float[] trykkSample = new float[trykkSensor.sampleSize()]; // tabell som inneholder avlest verdi

		boolean fortsett = true;

		int poeng = 0;
		A.kjorBand();


		while (fortsett) {
		A.trillTerninger(fargeSample, fargeLeser);
		}
	}
}

