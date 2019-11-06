/*
 * Shawn Stapel
 * 11/05/2019
 * Exercise 2-1
 */
import java.util.Scanner;
public class chapter2assignment1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a degree in Celsius:");
		double celsius = input.nextDouble();
		
		// Convert Celsius to Fahrenheit
		double fahrenheit = ((celsius * (5.0/9.0)+32));
		System.out.println("Celsius " + celsius + " is " + fahrenheit +" in Fahrenheit ");

	}

}
