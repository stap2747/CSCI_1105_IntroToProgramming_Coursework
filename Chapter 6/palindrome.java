/*
 * Shawn Stapel
 * Exercise 6-3 Implementation
 * 12/16/2019
 */

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter a number");
		int I = in.nextInt();
		//int reversed = reverse(I);
		if (isPalindrome(I)) {
			System.out.print(I + " Is a Palindrome");

		}
		else {
			System.out.print(I + " Is not a Palindrome");
		}

	}
	public static int reverse(int number) {
		String out="";

		while ( number != 0) {
			out += "" + number % 10;
			number /= 10;

		}
		return Integer.parseInt(out);

	}
	public static boolean isPalindrome( int number) {
		if (number == reverse(number)) {
			return true;

		}
		return false;












	}
}
