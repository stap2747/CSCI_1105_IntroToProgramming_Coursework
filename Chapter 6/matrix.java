/*
 * Shawn Stapel
 * 12/12/2019
 * Exercise 6-17 implementation
 */

import java.util.Scanner;

public class matrix {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a number ");
		int n = in.nextInt();
		printMatrix(n);
		
	}
	public static void printMatrix(int n) {
		
		
		for(int i = 0; i< n; i++) {
			
			
			for(int j = 0; j < n; j++) {
				int m = (int) (Math.random() * 2);
				System.out.print(m + " ");
				
			}
			System.out.println();
		}
		
	
		
	
		
		
	}
	

}
