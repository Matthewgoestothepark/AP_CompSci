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
		System.out.println("Please enter your first number: ");
		int x = sc.nextInt();
		System.out.println("Please enter your second number: ");
		int y = sc.nextInt();
		if(x == y){
			System.out.print("Your two numbers are the same");
		}
		else{
			System.out.print("Your two numbers are different");
		}
	}
}
