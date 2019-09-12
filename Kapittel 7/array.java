import static javax.swing.JOptionPane.*;

class array {
	public static void main(String[]args) {
	int[] mars = new int[5];
	for (int i = 0; i < mars.length; i++) {
		String tallLest = showInputDialog("Nedbør på dag nr: "+ (i + 1) + ". ");
		mars[i] = Integer.parseInt(tallLest);
	}
	for (int i =0; i < mars.length; i++) {
		System.out.println("Nedbør den " + (i + 1) + " var " + mars[i] + ". ");
	}



	}
}