/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in); 
		System.out.print("Please enter a number: ");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Here are the next 5 numbers!");
		System.out.print(number + 1 + ", ");
		System.out.print(number + 2 + ", ");
		System.out.print(number + 3 + ", ");
		System.out.print(number + 4 + ", ");
		System.out.print(number + 5 + " ");
		sc.nextLine();
		
		System.out.println("Here are the next 5 multiples of " + number + "!");
		System.out.print(number + ", ");
		System.out.print(number * 2 + ", ");
		System.out.print(number * 3 + ", "); 
		System.out.print(number * 4 + ", ");
		System.out.print(number * 5 + ", ");
		System.out.print(number * 6);
		sc.nextLine();
		
		System.out.println("Here is " + number + " divided by 100!");
		double numba = number;
		System.out.print(numba/100);
		sc.nextLine();
		
		System.out.println("Here is " + number + " divided by 10!");
		System.out.print(numba/10);

	}
}
