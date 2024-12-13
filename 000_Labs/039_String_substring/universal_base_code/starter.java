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
		BaseClass test = new BaseClass();
		System.out.println("Enter a word.");
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine(); 
		System.out.println("Letter by letter:");
		for(int i = 0; i < a.length(); i++){
			System.out.println("" + i + " " + a.substring(i, i+1));
		}

		
	}
}
