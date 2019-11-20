/*
 * Shawn Stapel
 * Exercise 4-23 Payroll
 * 11/19/2019
 */

import java.util.Scanner;

public class payroll {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		//prompt user to enter employee name
		System.out.print("Enter employee name");
		String s =input.nextLine();
		//prompt user to enter hours worked in a week
		System.out.print("Enter hours worked in a week");
		double hours=input.nextDouble();
		//prompt user to enter pay rate
		System.out.print("Enter pay rate");
		double payrate = input.nextDouble();
		// prompt user to enter federal tax withholding rate
		System.out.print("Enter federal tax withholding rate");
		double federalrate = input.nextDouble();
		// prompt user to enter state tax withholding rate
		System.out.print("Enter state tax withholding rate");
		double staterate = input.nextDouble();
		// Calculate total pay
		double totalpay = (hours * payrate);
		// Calculate federal tax withholding amount
		double federaltaxamount = (totalpay * federalrate);
		// Calculate State tax withholding amount
		double statetaxamount = (totalpay * staterate);
		// Calculate total deduction
		double totaldeduction = (federaltaxamount + statetaxamount);
		// Calculate Net Pay
		double netpay = (totalpay - totaldeduction);
		// display employee name
		System.out.print("Employee Name:" + s + "\n");
		// display hours worked
		System.out.printf("Hours Worked:%4.2f\n",+ hours);
		// display pay rate
		System.out.printf("Pay Rate:$%4.2f\n", + payrate);
		// display gross pay
		System.out.printf("Gross Pay:$%4.2f\n", + totalpay);
		// display deductions
		System.out.printf("Deductions:\n");
		System.out.printf("\tFederal Withholding (20.0%%):$%4.2f \n", + federaltaxamount); 
		System.out.printf("\tState Withholding (9.0%%):$%4.2f\n", + statetaxamount); 
		System.out.printf("\tTotal Deduction:$%4.2f\n", + totaldeduction);
		//display net pay
		System.out.printf("Net Pay:$%4.2f" , + netpay);



	}


}
