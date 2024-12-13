/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("Guess a random number between 1 and 1000: ");
		int x = sc.nextInt(); 
		int y = (int)(Math.random()*999)+1;
		if(x == y){
			System.out.print("Your guess is correct");
		}
		else if(x<y){
			System.out.print("Your guess is lower than the correct number. The number was " + y);
		} 
		else if (x>y){
			System.out.print("Your guess is higher than the correct number. The number was " + y);
		}
	}
}
