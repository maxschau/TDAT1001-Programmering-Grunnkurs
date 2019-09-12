import static javax.swing.JOptionPane.*;

class kalkulator3 {
	public static void main(String[]args) {
		int tall1 = Integer.parseInt(showInputDialog("Tall 1: "));
		int tall2 = Integer.parseInt(showInputDialog("Tall 2: "));
		String operatorLest = showInputDialog("Operator (+ - * / %):");
		char operator = operatorLest.charAt(0);

		switch(operator){
			case '+':
					showMessageDialog(null, "Svar: " + (tall1 + tall2));
					break;
			case '-':
					showMessageDialog(null, "Svar: " + (tall1 - tall2));
					break;
			case '*':
					showMessageDialog(null, "Svar: " + (tall1 * tall2));
					break;
			case '/':
					showMessageDialog(null, "Svar: " + (tall1 / tall2));
					break;
			case '%':
					showMessageDialog(null, "Svar: " + (tall1 % tall2));
					break;
			default:
					showMessageDialog(null, "Ugyldig operator. Bruk: + - * / %");
					break;
			}

		}
	}