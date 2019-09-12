/* FolgLinje.java  GS - 2012-01-20

 * Program som gj�r at en enkel robot f�lger en sort linje
 * Du trenger en enkel robot som kan svinge
 * en lyssensor koblet til sensor 1 - pekende nedover
 * en trykksensor koblet til sensor 2 - pekende rett fram i g� retningen
 */
import lejos.hardware.motor.*;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.port.Port;
import lejos.hardware.Brick;
import lejos.hardware.BrickFinder;
import lejos.robotics.SampleProvider;
import lejos.hardware.sensor.NXTLightSensor;

public class idiRally{

  public static void main (String[] arg) throws Exception  {

	// Definerer sensorer:
	Brick brick = BrickFinder.getDefault();
    Port s1 = brick.getPort("S1"); // fargesensor
 	Port s2 = brick.getPort("S2"); // trykksensor
 	Port s3 = brick.getPort("S3"); // lyssensor

	EV3ColorSensor fargesensor = new EV3ColorSensor(s1); // ev3-fargesensor
	SampleProvider fargeLeser = fargesensor.getMode("RGB");  // svart = 0.01..
	float[] fargeSample = new float[fargeLeser.sampleSize()];  // tabell som innholder avlest verdi

	/* Definerer en trykksensor */
	SampleProvider trykksensor = new EV3TouchSensor(s2);
	float[] trykkSample = new float[trykksensor.sampleSize()]; // tabell som inneholder avlest verdi

	NXTLightSensor lyssensor = new NXTLightSensor(s3);
	SampleProvider lysLeser = lyssensor.getRedMode();
	float[] lysSample = new float[lysLeser.sampleSize()];

	// Setter hastighet p� roboten
    Motor.A.setSpeed(400);
    Motor.C.setSpeed(400);


	// Beregn verdi for svart
	int hvit = 0;
	int lys = 0;
	for (int i = 0; i<100; i++){
		fargeLeser.fetchSample(fargeSample, 0);
		hvit += fargeSample[0]* 100;
		lysLeser.fetchSample(lysSample,0);
		lys += lysSample[0] * 100;
	}
	hvit = hvit / 100 - 5;
	lys = lys / 100 -5;
	System.out.println("Hvit: " + hvit);

	boolean fortsett = true;
	int teller = 1;

	while (fortsett){
		while (fargeSample[0]*100 >= hvit && lysSample[0]*100 >= lys) {
			System.out.println("hvit");
			Motor.A.forward();
			Motor.B.forward();
			fargeLeser.fetchSample(fargeSample, 0);
			lysLeser.fetchSample(lysSample, 0);

		}
		while (fargeSample[0]*100 < hvit || lysSample[0]* 100 < lys) {//N�r fargen blir sort
			System.out.println("Sort");
			if (fargeSample[0]*100 <= hvit) {
				Motor.A.forward();
				Motor.C.backward();
			} else {
				Motor.A.backward();
				Motor.C.backward();
			}
		}


      /*
      //while(fargeSample[0]*100 > svart){ //s� lenge fargen ikke er sort, sving og se etter sort farge
       		/*if(teller % 2 != 0){
       	 		 Motor.A.forward();
          		 Motor.C.backward();
         		 System.out.println("hvit");
         		 fargeLeser.fetchSample(fargeSample, 0); //les inn ny verdi
		    }else if(teller % 2 == 0){
				 Motor.A.backward();
				 Motor.C.forward();
				 System.out.println("hvit");
				 fargeLeser.fetchSample(fargeSample, 0);
	 	 	}
	 	}

	 	//teller++;
		while(fargeSample[0]*100 <= svart){
		 		Motor.A.forward();
				Motor.C.forward();
				Thread.sleep(300);
				System.out.println("hvit");
				fargeLeser.fetchSample(fargeSample, 0);
		}
		*/

		trykksensor.fetchSample(trykkSample, 0);
	 	if (trykkSample[0] > 0){
			System.out.println("Avslutter");
		 	fortsett = false;
		}

		}
	}
}

