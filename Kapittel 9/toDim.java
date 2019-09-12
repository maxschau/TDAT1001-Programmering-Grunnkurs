class toDim {
	public static void main(String[]args) {
		String[][] navn = {
		{"Max", "Schau"},
		{"Ole", "Olsen"},
		{"Donald", "Duck"}
		};

		for (int i = 0; i < navn.length; i++) {
			for (int j = 0; j < navn[i].length; j++){
				System.out.print(navn[i][j] + "\n");
			}
		System.out.println();
		}



	}
}