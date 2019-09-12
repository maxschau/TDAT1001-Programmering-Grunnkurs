import java.util.Arrays;

public class tabell {
	public static void main(String[] args) {
		int[] nummer = {1,4,6,88,-2,8,34,7,12,13,11,10,11};
		int storsteTall = nummer[0];
		int minsteTall = nummer[0];

		for (int i = 0; i < nummer.length; i++) {
			if (nummer[i] > storsteTall) {
				storsteTall = nummer[i];
			}
			if (nummer[i] < minsteTall) {
				minsteTall = nummer[i];
			}
		}
		System.out.println("Det minste tallet i tabellen er: " + minsteTall + ", og det største tallet er: " + storsteTall);
		
	}
}