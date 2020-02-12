/*
 * Shawn Stapel
 * 2/5/2020
 * Exercise 7-9
 */
import java.util.Scanner;

public class exercise7_9 {
	Scanner in = new Scanner(System.in);

	public static void main(String[] args) {


		int[] array = readIntegers(10);
		int s = min(array);
		System.out.println("The minmum number is: " + s );



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

	public static int min(int[] array) {
		int s = array[0];
		for (int i = 0; i<array.length; i++) {
			if (array[i] < s)
				s = array[i];
		}
		return s;

	}
}
