import static javax.swing.JOptionPane.*;
class Abra {
	public static void main(String[] args) {
		String input = showInputDialog("Please write your number from 1 to 100");
		int number = Integer.parseInt(input);
		while (number < 1 || number > 100) {
			input = showInputDialog("Please write your number from 1 to 100");
			number = Integer.parseInt(input);
		}

		for (int i = 0; i < number; i++) {
			System.out.println((i+1) + " Abracadabra");
		}

	}

}