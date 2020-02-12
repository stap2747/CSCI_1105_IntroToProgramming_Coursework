import java.util.Scanner;

/*
 * Shawn Stapel
 * 2/10/2020
 * exercise 7_15
 */

public class exercise7_15 {
	Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int[] array = readIntegers(10);
		int[] sorted = deleteduplicates(array);
		for (int i=0; i<sorted.length; i++) {
			System.out.print(sorted[i] + " ");

		}


	}




	public static int[] readIntegers(int count) {
		int[] array = new int[count];


		for(int i = 0; i<array.length; i++) {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter a number:");
			int number = in.nextInt();
			array[i] = number;

		}
		return array;
	}
	public static int[] deleteduplicates(int [] array ) {
		int c = 0;
		int[] m = new int[array.length];
		for (int i = 0; i<array.length; i++) {
			boolean v = true;
			for(int j = 0; j<m.length; j++) {
				if (array [i] == m[j]) {
					v = false;	
				}
			}
			if (v == true) {
				m[c] = array[i];
				c++;
			}



		}
		int[] sorted = new int[c];
		for (int i = 0; i<sorted.length; i++) {
			sorted[i] = m[i];}

		return sorted;
	}

}










