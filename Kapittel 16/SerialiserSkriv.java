import java.io.*;

class SerialiserSkriv {
	public static void main(String[] args) {
		try(FileOutputStream utStrom = new FileOutputStream("ser1.ser");ObjectOutputStream ut = new ObjectOutputStream(utStrom)) {
		klubb klubb1 = new klubb("VIF", 20);
		ut.writeObject(klubb1);
		ut.close();



		}catch (EOFException eofe) {
			System.out.println("Uventet slutt på filen");
		} catch (IOException ioe) {
			System.out.println("IO-feil: " + ioe);
		}


	}
}