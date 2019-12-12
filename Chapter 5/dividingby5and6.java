/*
 * Shawn Stapel
 * Exercise 5-11
 * 12/3/2019
 */


import java.util.Scanner;
public class dividingby5and6 {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		//starting the program
		System.out.print("Counting from 100 - 200\n");
		System.out.print("Divisible by 5 or 6, but not 5 and 6\n");

		// setting parameters

		final int NUMBERS_PER_LINE = 10; // Display 10 per line
		int count = 0;// count starts at 0
		int number = 100; // A number to start with to test


		// Repeatedly test numbers
		for (int start = 100; start<=200; start++) {
			if (start % 5 == 0 ^ start % 6==0) {
				System.out.print(start + " ");
				count++;

			}



			if (count == NUMBERS_PER_LINE) {
				System.out.print("\n");
				count=0;

			}




		}











	}

}
