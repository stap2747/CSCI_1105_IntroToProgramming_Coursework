/*
 * Shawn Stapel
 * Exercise 3-19
 */
import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		//prompt user to enter a value for sides 1,2,3
		System.out.print("Enter a value for side 1");
		double side1 = input.nextDouble();
		System.out.print("Enter a value for side 2");
		double side2 = input.nextDouble();
		System.out.print("Enter a value for side 3");
		double side3 = input.nextDouble();

		// check for valid inputs
		if (side1 + side2 <= side3) {
			System.out.print("invalid inputs");
		}

		else if (side2 + side3 <= side1) {
			System.out.print("invalid inputs");
		}

		else if (side1 + side3 <= side2) {
			System.out.print("invalid inputs");
		}
		else  {
			double perimeter = (side1 + side2 + side3);
			System.out.print("perimeter =" + perimeter);
		}


	}
}






