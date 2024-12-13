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
		System.out.print("Input a number and we'll print out every prime until that number: ");
		int num = sc.nextInt();
		printPrimes(num);
	}
	
	public static boolean checkPrime(int num){
		int divider = num-1;
		boolean primecheck = true;
		while(divider>=2){
			if(num % divider == 0){
				primecheck = false;
				break;
			}
		divider = divider - 1;	
		}
		return primecheck;
	}
	
	public static void printPrimes(int num){
		int fds = 2; 
		while (fds<=num){
			if(checkPrime(fds)){
				System.out.println(fds);
			}
			fds = fds + 1;
		}
	}
	
}
