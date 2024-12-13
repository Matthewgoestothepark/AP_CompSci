/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		int secret = (int)(Math.random()*1000)+1;
		int guess = 0;
		while (guess != secret){
			System.out.print("Guess a number: ");
			guess = sc.nextInt();
			if(guess < secret){
				System.out.println("You're a little too low");
			}
			if(guess > secret){
				System.out.println("You're a little too high");
			}
		}
		System.out.print("You guessed the correct answer");
	
		
		
		



		
	}
}
