class test {
	public static void main(String[] args) {
		String tekst = "Hei dette er en rotasjonstest, rrr";
		final char tegn = 'r';
		int antallTegn = 0;
		System.out.println(tekst.length());
		for (int i = 0; i < tekst.length(); i++) {
			int indeks = tekst.indexOf(tegn);
			if (indeks == -1) {
				antallTegn++;
				indeks = tekst.indexOf(tegn, indeks + 1);
			}

		}
		System.out.println(antallTegn);
	}
}