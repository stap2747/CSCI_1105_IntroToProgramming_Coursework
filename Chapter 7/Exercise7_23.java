/*
 * Shawn Stapel
 * 2/11/2020
 * Exercise 7-23
 */
public class Exercise7_23 {

	public static void main(String[] args) {

		boolean[] lockers = new boolean[100];

		for(int s=1; s<=100; s++) {
			for (int i=s-1; i<lockers.length; i+=s) {
				lockers[i] = !lockers[i];
			}
		}
		for (int i =0; i<lockers.length; i++) {
			if (lockers[i]) {
				System.out.print(i+1 + " " );
			}
		}
	}
}
