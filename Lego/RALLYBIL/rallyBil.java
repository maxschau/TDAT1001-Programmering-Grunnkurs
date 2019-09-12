import lejos.hardware.motor.*;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.port.Port;
import lejos.hardware.Brick;
import lejos.hardware.BrickFinder;
import lejos.robotics.SampleProvider;

public class rallyBil {
	public static void main (String[] arg) throws Exception  {

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
		System.out.println("Svart: " + svart);
		boolean fortsett = true;

		while(fortsett) {

		while(fargeSample[0]*100 <= svart){ //Hvis fargen er sort
			fargeLeser.fetchSample(fargeSample, 0);
			Motor.A.forward();
			Motor.C.forward();
			while (fargeSample[0]*100 > svart) { //Så lenge fargen fargen ikke er sort
				for (int i = 0; i < 100; i++) {
					if (i < 33) {
						Motor.A.stop();
						Motor.C.forward();
					} else {
						Motor.A.forward();
						Motor.C.stop();
					}

				}

			}
		}

	trykksensor.fetchSample(trykkSample, 0);
		if (trykkSample[0] > 0){
			System.out.println("Avslutter");
		 	fortsett = false;
		}
	}




	}
}


