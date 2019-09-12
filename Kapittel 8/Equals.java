import static javax.swing.JOptionPane.*;

class Equals{
	public static void main(String[]args) {
		String tekst1 = "Ole Magnus";
		String tekst2 = "Anders";
		String tekst3 = "Ole MAgnus";

		boolean likhet;
		boolean likhet2;
		boolean likhet3;

		likhet = tekst1.equals(tekst2);
		likhet2= tekst1.equals(tekst3);
		likhet3= tekst1.equalsIgnoreCase(tekst3);
		System.out.println(likhet);
		System.out.println(likhet2);
		System.out.println(likhet3);


	}
}