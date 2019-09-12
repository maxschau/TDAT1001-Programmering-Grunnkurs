class SorteringVUtvelg {
	public static void main(String[] args) {
	int[] tall = {1,5,1,5,2,3,9,10,19,-8,5};

	SorteringUv2 s1 = new SorteringUv2();
	s1.sorter(tall);
	for (int i = 0; i < tall.length; i++) {
		System.out.println(tall[i]);
	}



	}
}