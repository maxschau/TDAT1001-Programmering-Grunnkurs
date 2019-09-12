import lejos.hardware.motor.*;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.port.Port;
import lejos.hardware.Brick;
import lejos.hardware.BrickFinder;
import lejos.robotics.SampleProvider;

class SensorTest{
	public static void main(String[] arg) throws Exception{

		Brick brick = BrickFinder.getDefault();
		Port s1 = brick.getPort("S1"); // Fargesensor
		Port s2 = brick.getPort("S2"); // Trykksensor

		EV3ColorSensor fargesensor = new EV3ColorSensor(s1); // EV3 fargesensor
		SampleProvider fargeLeser = fargesensor.getMode("RGB"); // Setter modus til RGB for fargesensoren
		float[] fargeSample = new float[fargeLeser.sampleSize()]; // Tabell med fargeverdier

		SampleProvider trykksensor = new EV3TouchSensor(s2); // Legger inn en trykksensor
		float[] trykkSample = new float[trykksensor.sampleSize()]; // Tabell for verdier til tryksensor

		int blaa = 0;
		for (int i = 0; i < 100; i++){
			fargeLeser.fetchSample(fargeSample, 0);
			blaa += fargeSample[0]*100;
		}
		blaa = blaa / 100 + 5;
		System.out.println("Blå: "+blaa);
		Thread.sleep(10000);

		int svart = 0;
				for (int i = 0; i < 100; i++){
					fargeLeser.fetchSample(fargeSample, 0);
					svart += fargeSample[0]*100;
				}
				svart = svart / 100 + 5;
				System.out.println("Svart: "+svart);
		Thread.sleep(10000);

		int gul = 0;
				for (int i = 0; i < 100; i++){
					fargeLeser.fetchSample(fargeSample, 0);
					gul += fargeSample[0]*100;
				}
				gul = gul / 100 + 5;
				System.out.println("Gul: "+gul);
		Thread.sleep(10000);

		int rosa = 0;
				for (int i = 0; i < 100; i++){
					fargeLeser.fetchSample(fargeSample, 0);
					rosa += fargeSample[0]*100;
				}
				rosa = rosa / 100 + 5;
				System.out.println("Rosa: "+rosa);
		Thread.sleep(10000);

		int hvit = 0;
				for (int i = 0; i < 100; i++){
					fargeLeser.fetchSample(fargeSample, 0);
					hvit += fargeSample[0]*100;
				}
				hvit = hvit / 100 + 5;
				System.out.println("Hvit: "+hvit);
		Thread.sleep(10000);

		int rod = 0;
				for (int i = 0; i < 100; i++){
					fargeLeser.fetchSample(fargeSample, 0);
					rod += fargeSample[0]*100;
				}
				rod = rod / 100 + 5;
				System.out.println("Rød: "+rod);
		Thread.sleep(10000);
	}
}
