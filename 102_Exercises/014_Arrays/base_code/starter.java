/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 
		 int [] arr = new int [1001];
		 int i = 0; 
		 int num = 3; 
		 while (i<arr.length){
		 	arr[i] = num; 
		 	System.out.print(arr[i] + ", ");
		 	num = num + 3; 
		 	i ++;
		 }
		 System.out.println("");
		 
		 
		 int [] arr2 = new int [1001];
		 int x = 0; 
		 int num2 = 1000;
		 while (x<arr2.length){
		 	arr2[x] = num2; 
		 	System.out.print(arr2[x] + ", ");
		 	num2 = num2 - 1; 
		 	x ++; 
		 }
		 
	}
}
