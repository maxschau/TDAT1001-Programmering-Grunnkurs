class Serialisering.java{
	public static void main(String[] args) {
		//Klassen må ha implements serializable!
		String filnavn = "Serialisering.ser";

		try(FileInputStream innstrom = new FileInputStream(filnavn); ObjectInputStream inn = new ObjectInputStream(innstrom)) {
			//Eksempel
			Student stud1 = (Student)inn.readObject();
			//Kan eventuelt lese dersom det skulle eksistere en tabell
			inn.close();

		}catch (IOException e) {
			e.printStackTrace();
		}

	}
}