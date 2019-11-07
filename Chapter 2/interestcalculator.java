/*
 * Shawn Stapel
 * 11/5/2019
 * Exercise 2-13
 */
import java.util.Scanner;
public class interestcalculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a monthly saving amount:");
		double monthlyamount = input.nextDouble();
		
		// account value after 6 months calculation
		double accountvalue1 = (monthlyamount * 1.00417); 
				double accountvalue2 = ((accountvalue1 + monthlyamount) * 1.00417);
				double accountvalue3 = ((accountvalue2 + monthlyamount) * 1.00417);
				double accountvalue4 = ((accountvalue3 + monthlyamount) * 1.00417);
				double accountvalue5 = ((accountvalue4 + monthlyamount) * 1.00417);
				double accountvalue6 = ((accountvalue5 + monthlyamount) * 1.00417);
				System.out.print(" Account balance after 6 months is " + accountvalue6 );
		
	}

}
