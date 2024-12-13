/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		myCharacter test = new myCharacter();
		test.printCharacter(); 
		
		System.out.println("------------------------------------------------");
		System.out.println("What class would you like to be?");
		String answer = sc.nextLine();
		myCharacter test2 = new myCharacter(answer);
		test2.printCharacter();
		
	}
}
