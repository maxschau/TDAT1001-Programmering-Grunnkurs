class Maned{

	// objektvariabel
	private final String mndNavn;
	private final int[] nedb�r;

	// konstrukt?r
	public Maned(String mndNavn, int[] nedb�r){

		/* oppgave 4 s 223: Kast unntak dersom tabellen inneholder negative
		 * tall.*/

		this.mndNavn = mndNavn;

		/* Grunn kopiering */
		//this.nedb?r = nedb?r;

		/* Dyp kopiering */
		this.nedb�r = new int[nedb�r.length];
		for(int i=0; i<nedb�r.length; i++){
			this.nedb�r[i] = nedb�r[i];
		}

	}

	public String getMndNavn(){
		return mndNavn;
	}

	public int finnAntDager(){
		return nedb�r.length;
	}


	public int finnNedb�r(int indeks){
		if (gyldigIndeks(indeks)){
			return nedb�r[indeks];
		}

		return -1;
	}

	private boolean gyldigIndeks(int i){
		 if (i>= 0 && i < nedb�r.length){
			 return true;
		 }else {
			return false;
		 }
	}

	public int  finnMaksimum(){
		int maks = 0;
		for(int i=0; i<nedb�r.length; i++){
			if(maks < nedb�r[i]){
				maks = nedb�r[i];
			}
		}
		return maks;
	}

	public int  finnAntT�rreDager(){
		int ant = 0;
		for(int i=0; i<nedb�r.length; i++){
			if(nedb�r[i] == 0){
				ant++;
			}
		}
		return ant;
	}

	public int finnGjSnitt(){
		int sum = 0;
		for(int i=0; i<nedb�r.length; i++){
			sum += nedb�r[i];
		}

		return sum/nedb�r.length;
	}


	public int finnAntDgMedNedb�rLikMaks() {
		int maks = finnMaksimum();
		int antDager = 0;
		for (int i = 0; i < nedb�r.length; i++) { //G�r gjennom arrayet
			if (nedb�r[i] == maks) { //Hvis nedb�r er lik maksimalt
				antDager ++;
			}
		}
		return antDager;
	}

	public int finnDagerUnder(int regn) {
		int antDager = 0;
		for (int i = 0; i < nedb�r.length; i++) {
			if (nedb�r[i] < regn) {
				antDager ++;
			}
		}
		return antDager;
	}



	/* lager en toString-metode for ? kunne skrive ut
	   innhold til objektvariablene p? en enkelt m?te:
	 */
	 public String toString(){
	 	String res = mndNavn + "\n";
	 	for(int i= 0; i<nedb�r.length; i++){
	 			res += nedb�r[i] + " ";
	 	}
	 	return res;
	}

	// Oppgaver fra l?reboka - gj?r disse:
	/*public int [] finnDgMaks(){
	}
	public int  finnAntDagerMaks(){
	}
	public int finnAntDagerMindre(int grense){
	}
	public int  finnStandardavvik(){
	}
	*/
}