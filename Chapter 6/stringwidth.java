/*
 * Shawn Stapel
 * 6-37 Implementation
 * 12/18/2019
 */
import java.util.Scanner;

public class stringwidth {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter a number" + " ");
		int N = in.nextInt();
		System.out.print("enter the width" + " ");
		int W = in.nextInt();
		System.out.print(format(N,W));


	}
	public static String format(int number, int width) {
		String inputnumber = Integer.toString(number);
		int length = inputnumber.length();

		if(length >= width)
			return inputnumber;

		else {
			for (int I = 0; I < width - length; I++){
				inputnumber = "0" + inputnumber;
			


			}
			return inputnumber;

			}
		}
	}












