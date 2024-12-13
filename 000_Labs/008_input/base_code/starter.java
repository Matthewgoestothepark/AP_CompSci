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
		System.out.print("Please enter your first name: ");
		String name = sc.nextLine();
		System.out.println("Your name is " + name);
		
		System.out.print("Please enter your age: ");
		int age = sc.nextInt();
		System.out.println("Your age is " + age);
		sc.nextLine();
		
		System.out.print("Please enter your birth month: ");
		String month = sc.nextLine();
		System.out.println("Your birth month is " + month);
		
		System.out.print("Please enter your birthday: ");
		int day = sc.nextInt();
		System.out.println("Your birthday is " + day);
		sc.nextLine();
		
		System.out.print("Please enter your birth year: ");
		int year = sc.nextInt();
		System.out.println("Your birth year is " + year); 
		sc.nextLine();
		
		System.out.print("How much is a buck fifty?: ");
		double money = sc.nextDouble();
		System.out.println("A buck fifty is " + money + " dollars");
	}
}
