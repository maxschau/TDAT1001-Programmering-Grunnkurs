import java.io.*;
class SerialiserLes {
	public static void main(String[] args) {
		try(FileInputStream innstrom = new FileInputStream("ser1.ser"); ObjectInputStream inn = new ObjectInputStream(innstrom)) {
			klubb klubb1 = (klubb)inn.readObject();
			inn.close();
			System.out.println(klubb1.getNavn());
			System.out.println(klubb1.getAlder());

		}catch (EOFException eofe) {
			System.out.println("Uventet slutt på filen");
		} catch (IOException ioe) {
			System.out.println("IO-feil: " + ioe);
		} catch (Exception e) {
			System.out.println("Annen feil: " + e);
		}
	}

}