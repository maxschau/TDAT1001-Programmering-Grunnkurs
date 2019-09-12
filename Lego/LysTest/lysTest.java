/* FolgLinje.java  GS - 2012-01-20

 * Program som gjør at en enkel robot følger en sort linje
 * Du trenger en enkel robot som kan svinge
 * en lyssensor koblet til sensor 1 - pekende nedover
 * en trykksensor koblet til sensor 2 - pekende rett fram i gå retningen
 */
import lejos.hardware.motor.*;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.port.Port;
import lejos.hardware.Brick;
import lejos.hardware.BrickFinder;
import lejos.robotics.SampleProvider;
import lejos.hardware.sensor.NXTLightSensor;

public class lysTest{

  public static void main (String[] arg) throws Exception  {

	// Definerer sensorer:
	Brick brick = BrickFinder.getDefault();
 	Port s3 = brick.getPort("S3"); // lyssensor
 		Port s2 = brick.getPort("S2"); // trykksensor

	NXTLightSensor lyssensor = new NXTLightSensor(s3);
	SampleProvider lysLeser = lyssensor.getRedMode();
	float[] lysSample = new float[lysLeser.sampleSize()];



	int lys = 0;
	for (int i = 0; i<100; i++){
		lysLeser.fetchSample(lysSample,0);
		lys += lysSample[0] * 100;
	}
	lys = lys / 100 + 5;
	System.out.println("Hvit: " + lys);

	boolean fortsett = true;
	//int teller = 1;

	while (fortsett){
		while (lysSample[0]*100 < lys) {//HVIT
			System.out.println("Lys: " + lys);
			System.out.println("hvit");
			System.out.println(lysSample[0]*100);
			Motor.A.forward();
			Motor.C.forward();
			lysLeser.fetchSample(lysSample, 0);
		}

	while (lysSample[0]*100 >= lys) { //SVART!!!!
		System.out.println("Sort");
		System.out.println(lysSample[0]*100);
		Motor.A.backward();
		Motor.C.forward();
		lysLeser.fetchSample(lysSample, 0);

	}
	/* Definerer en trykksensor */
	SampleProvider trykksensor = new EV3TouchSensor(s2);
	float[] trykkSample = new float[trykksensor.sampleSize()]; // tabell som inneholder avlest verdi
	trykksensor.fetchSample(trykkSample, 0);
		if (trykkSample[0] > 0){
			System.out.println("Avslutter");
		 	fortsett = false;
		}

	}



	}
}

