/*
 * Shawn Stapel
 * Exercise 8-9
 * 2/19/2020
 */
import java.util.Scanner;
public class Exercise8_9 {

	public static void main(String[] args) {
		String[][] board = {
				{"-","-","-"},
				{"-","-","-"},
				{"-","-","-"}
		};
		for(int r=0; r<5; r++) {
			board = turns(board,r);


		}




	}


	public static String[][] turns(String[][] board, int r){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a row for player X: " ); 
		int a = in.nextInt();
		System.out.print("Enter a column for player X: " ); 
		int b = in.nextInt();

		while(!board[a][b].equals ("-")) {
			System.out.print("That space is already occupied. Please enter another row and column");
			System.out.print("Enter a row for player X: " ); 
			a = in.nextInt();
			System.out.print("Enter a column for player X: " ); 
			b = in.nextInt();
		}

		board[a][b] = "x";

		System.out.print("Enter a row for player O: " ); 
		int c = in.nextInt();
		System.out.print("Enter a column for player O: " ); 
		int d = in.nextInt();

		while(!board[c][d].equals ("-") && r != 4) {
			System.out.print("That space is already occupied. Please enter another row and column\n");
			System.out.print("Enter a row for player O: " ); 
			c = in.nextInt();
			System.out.print("Enter a column for player O: " ); 
			d = in.nextInt();

		}
		
		board[c][d] = "O";
		
		for(int i=0; i<board.length; i++) {
			for( int j=0; j<board.length; j++) {
				System.out.print(board[i][j] + "\t");
			}
			System.out.println();
		}
		return board;

	}


}
