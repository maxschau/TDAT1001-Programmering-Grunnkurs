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
import lejos.hardware.sensor.NXTSoundSensor;
import lejos.hardware.lcd.*;
import lejos.hardware.ev3.EV3;

public class SimonHitra{

  public static void main (String[] arg) throws Exception  {

	// Definerer sensorer:
	Brick brick = BrickFinder.getDefault();
    Port s1 = brick.getPort("S1"); // fargesensor
	Port s4 = brick.getPort("S4");

	EV3 ev3 = (EV3) BrickFinder.getLocal();
	TextLCD lcd = ev3.getTextLCD();

	EV3ColorSensor fargesensor = new EV3ColorSensor(s1); // ev3-fargesensor
	SampleProvider fargeLeser = fargesensor.getMode("RGB");  // svart = 0.01..
	float[] fargeSample = new float[fargeLeser.sampleSize()];  // tabell som innholder avlest verdi

	NXTSoundSensor lydsensor = new NXTSoundSensor(s4);
	SampleProvider lydLeser = lydsensor.getDBMode();
    float[] lydSample = new float[lydLeser.sampleSize()];


	// Setter hastighet på roboten
    Motor.A.setSpeed(250);
    Motor.C.setSpeed(250);
	Motor.B.setSpeed(200);  // vifte arm

	// Beregn verdi for svart
	int svart = 0;
	for (int i = 0; i<100; i++){
		fargeLeser.fetchSample(fargeSample, 0);
		svart += fargeSample[0]* 100;
	}
	svart = svart / 100 + 5;
	System.out.println("Svart: " + svart);



	int teller = 0;

	 Motor.A.forward();
	 Motor.B.forward();
	 Motor.C.forward();
	 Thread.sleep(1000);

	while (teller < 5){ 	// Fortsett så lenge roboten ikke treffer noe
	   fargeLeser.fetchSample(fargeSample, 0);
       if (fargeSample[0]*100 < svart){   // sjekk sort linje
       	  /*Motor.A.forward();
          Motor.C.stop();  		// snu i  200 millisekund
          Thread.sleep(4000);
          */
          Motor.A.stop(true);
		  Motor.C.stop(true);
			Motor.A.rotate(770);
          System.out.println("svart");
          teller++;
       } else {
		   // Kjør framover
		   Motor.A.forward();
		   Motor.C.forward();
		   System.out.println("hvit");
	   }

	   if (lydSample != null && lydSample.length > 0){
	   	   lydsensor.fetchSample(lydSample, 0);

	   	    if (lydSample[0] > 0.45 ){
				Motor.A.stop(true);
				Motor.C.stop(true);
				lcd.clear();
				lcd.drawString("Lyd registrert", 0, 3);
				Thread.sleep(1500);
			}
	   }


    }
  }
}


