import static javax.swing.JOptionPane.*;
class OppgaveTime {
	public static void main(String[]args) {

		int[] m�ned = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		int svar = showConfirmDialog(null, "Er det et skudd�r?", "�r", YES_NO_OPTION);

		if (svar == YES_OPTION) {
			m�ned[1] = 29;
		}

		for (int i = 0; i < m�ned.length; i++) {
			System.out.println(m�ned[i]);
		}





	}
}