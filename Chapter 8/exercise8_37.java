/*
 * Shawn Stapel 
 * 2/18/2020
 * Exercise 8-37
 */

import java.util.Scanner;

public class exercise8_37 {

	public static void main(String[] args) {
		String[][] states = {
				{"ALABAMA", "MONTGOMERY"},
				{"ALASKA","JUNEAU"},
				{"ARIZONA","PHEONIX"},
				{"ARKANSAS","LITTLE ROCK"},
				{"CALIFORNIA","SACRAMENTO"},
				{"COLORADO","DENVER"},
				{"CONNECTICUT","HARTFORD"},
				{"DELAWARE","DOVER"},
				{"FLORIDA","TALLAHASSEE"},
				{"GEORGIA","ATLANTA"}
		};


		String[] useranswer = capitaltest(states);
		grading(useranswer, states);

	}


	public static String[] capitaltest(String[][] states) {
		Scanner in = new Scanner(System.in);
		String[] array= new String[10];

		for(int i = 0; i<states.length; i++) {
			System.out.print("Enter the capital for " + states[i][0] + ": "); 


			array[i] = in.nextLine();

		}

		return array;
	}
	public static void grading(String[] useranswer, String[][] states) {
		int correctcount = 0;
		for(int i = 0; i<states.length; i++){
			if (useranswer[i].equalsIgnoreCase(states[i][1]))
				correctcount++;


		}
		System.out.print("You got "+ correctcount + " answers correct");

	}


}

