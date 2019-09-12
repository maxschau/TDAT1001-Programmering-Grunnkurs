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

public class idiRallyMartin{

  public static void main(String[] arg) throws Exception {

		// Definerer sensorer:
		Brick brick = BrickFinder.getDefault();
	    Port s1 = brick.getPort("S1"); // fargesensor
	 	Port s2 = brick.getPort("S2"); // trykksensor

		EV3ColorSensor fargesensor = new EV3ColorSensor(s1); // ev3-fargesensor
		SampleProvider fargeLeser = fargesensor.getMode("RGB");  // svart = 0.01..
		float[] fargeSample = new float[fargeLeser.sampleSize()];  // tabell som innholder avlest verdi

		/* Definerer en trykksensor */
		SampleProvider trykksensor = new EV3TouchSensor(s2);
		float[] trykkSample = new float[trykksensor.sampleSize()]; // tabell som inneholder avlest verdi

		// Setter hastighet på roboten
	    Motor.A.setSpeed(400);
	    Motor.C.setSpeed(400);

		// Beregn verdi for svart
		int svart = 0;
		for (int i = 0; i<100; i++){
			fargeLeser.fetchSample(fargeSample, 0);
			svart += fargeSample[0]* 100;
		}
		svart = svart / 100 + 5;
		System.out.println("Klar, ferdig, gå");

		boolean fortsett = true;
		while (fortsett){
			trykksensor.fetchSample(trykkSample, 0);
		 	if (trykkSample[0] > 0){
				System.out.println("Avslutter");
			 	fortsett = false;
			}

			while(fargeSample[0]*100 <= svart){
		 		Motor.A.forward();
				Motor.C.forward();
				System.out.println("svart, kjører");
				fargeLeser.fetchSample(fargeSample, 0);
			}

			fargeLeser.fetchSample(fargeSample, 0); //fanger farge
	      while(fargeSample[0]*100 > svart){ //så lenge fargen ikke er sort, sving og se etter sort farge
				 Motor.A.stop(true);
				 Motor.C.forward();
				 Thread.sleep(300);
				 System.out.println("hvit, svinger til høyre");
				 fargeLeser.fetchSample(fargeSample, 0); //les inn ny verdi
			 	 Motor.C.stop(true);
			    Motor.A.forward();
				 Thread.sleep(600);
			    System.out.println("hvit, svinger til venstre");
			    fargeLeser.fetchSample(fargeSample, 0); //les inn ny verdi
		 	}
		}
	}
}


