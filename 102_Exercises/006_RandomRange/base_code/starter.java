/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers to create a range for your random number");
		System.out.print("Please enter an integer: ");
		int number1 = sc.nextInt();
		System.out.print("Please enter another integer(Bigger than the first): ");
		int number2 = sc.nextInt();
		sc.nextLine();
		System.out.println("Your range is " + number1  + " to " + number2);
		System.out.println("Here are 5 numbers generated in that range");
		int a = (int)(Math.random()*(number2-number1))+number1;
		int b = (int)(Math.random()*(number2-number1))+number1;
		int c = (int)(Math.random()*(number2-number1))+number1;
		int d = (int)(Math.random()*(number2-number1))+number1;
		int e = (int)(Math.random()*(number2-number1))+number1;
		System.out.print(a + ", " + b + ", " + c + ", " + d + ", " + e);
		
		
		
		
	}
}
