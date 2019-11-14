/* 
 * Shawn Stapel
 * Exercise 3-3
 */

import java.util.Scanner;

public class cramersrule {
	public static void main(String [] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter values for a,b,c,d,e,f
		System.out.print("Enter a value for a");
		double a = input.nextDouble();
		System.out.print("Enter a value for b");
		double b = input.nextDouble();
		System.out.print("Enter a value for c");
		double c = input.nextDouble();
		System.out.print("Enter a value for d");
		double d = input.nextDouble();
		System.out.print("Enter a value for e");
		double e = input.nextDouble();
		System.out.print("Enter a value for f");
		double f = input.nextDouble();
		//check for 0
		if((a*d-b*c)==0) {
			System.out.print("no solution");
		}
		else {
			double x = ((e*d-b*f)/(a*d-b*c));
			double y = ((a*f-e*c)/ (a*d-b*c));
			System.out.print("x =" + x);
			System.out.print("y =" + y);
		}
	}

}
