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
		System.out.print("Please input your first numbner: ");
		int x = sc.nextInt();
		System.out.print("Please input your second number: ");
		int y = sc.nextInt();
		System.out.print("Please input your third number: ");
		int z = sc.nextInt();
		if(x>y && x>z){
			System.out.println(x + " is the greatest of the three");
		}
		if(y>x && y>z){
			System.out.println(y + " is the greatest of the three");
		}
		if(z>x && z>y){
			System.out.println(z + " is the greatest of the three");
		}
		
		if(x<y && x<z){
			System.out.print(x + " is the smallest of the three");
		}
		if(y<x && y<z){
			System.out.print(y + " is the smallest of the three");
		}
		if(z<x && z<y){
			System.out.print(z + " is the smallest of the three");
		}
	}
}
