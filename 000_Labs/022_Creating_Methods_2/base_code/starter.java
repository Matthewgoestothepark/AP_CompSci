/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your base number?");
		int base = sc.nextInt();
		System.out.println("What is your exponent number?");
		int exponent = sc.nextInt();
		System.out.print("Your answer is: ");
		pow(base, exponent);
		
	}
	
	public static void pow(int base, int exponent){
		int power = 1;
		while(exponent >= 1){
			power = power * base;
			exponent = exponent - 1;
		}
		
		System.out.print(power);
	}
}
