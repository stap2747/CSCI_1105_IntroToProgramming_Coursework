/*
 * Shawn Stapel
 * 12/11/2019
 * Exercise 5-49
 */
import java.util.Scanner;

public class vowelsandconsonants {
	public static void main(String [] args) {
		// Create a Scanner
		Scanner input= new Scanner(System.in);

		//prompt user to enter a word
		System.out.print("Enter a word: ");

		String w = input.nextLine();

		String v = "AEIOU";

		w=w.toUpperCase();

		int i = 0;

		int countv = 0;
		int countc = 0;


		for (i=0; i < w.length(); i++ ) 

			if (w.charAt(i) == 'A' || w.charAt(i) == 'E' || w.charAt(i) == 'I' || w.charAt(i) == 'O' || w.charAt(i) == 'U') { 
				countv++;}

			else countc++;

		input.close();
		System.out.print("There are" +" "+ countv +" "+ "vowels\n");
		System.out.print("There are" + " "+ countc + " " + "consonants");
	}
}


















