import java.util.Scanner;

public class areaofpentagon {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		//prompt user to enter a value for radius of a pentagon
		System.out.print("Enter the length from the center to the vertex:");
		double radius = input.nextDouble();

		//calculating the side length

		double side = (2 * radius) * (Math.sin(Math.PI /5));
		
		//calculating the area
		
		double area = (5 * Math.pow(side,2)) / (4 * (Math.tan(Math.PI /5)));
		
		//Printing area
		
		System.out.printf("Area = %4.2f", + area);

	}

}
