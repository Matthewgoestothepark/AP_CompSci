/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		System.out.println("Write a sentence!");
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		
		System.out.println("Write a sentence!");
		String sentence2 = sc.nextLine();
		
		System.out.println("\n");
		System.out.println("This is using the methods!");
		toString(sentence);
		toStringCombined(sentence, sentence2);

		
	}
	public static void toString(String sentence){
		System.out.println(sentence);
		
	}
	
	public static void toStringCombined(String sentence, String sentence2){
		System.out.println(sentence + " " + sentence2);
	}
}
