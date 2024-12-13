/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input a number: ");
		double number1 = sc.nextInt();
		System.out.print("Please input another number: ");
		double number2 = sc.nextInt();
		
		System.out.println("The max of these two numbers is " + Math.max(number1, number2));
		System.out.println("The square root of your second number is " + Math.sqrt(number2));
		System.out.println("Your first number to the power of your second number is " + Math.pow(number1, number2));
	}
}
