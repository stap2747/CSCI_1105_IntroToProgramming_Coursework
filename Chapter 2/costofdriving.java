/*
 * Shawn Stapel
 * 11/6/2019
 * exercise 2-23
 */
import java.util.Scanner;
public class costofdriving {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the driving distance:");
		double drivingdistance = input.nextDouble();
		System.out.print("Enter miles per gallon of vehicle");
		double vehiclempg = input.nextDouble();
		System.out.print("Enter the price per gallon of fuel");
		double fuelcost = input.nextDouble();
		//calculating cost of trip
		double costoftrip = ((drivingdistance / vehiclempg) * fuelcost);
			System.out.print("The cost of fuel for the trip is $" +costoftrip);
	
	}

}
