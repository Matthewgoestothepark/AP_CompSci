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
		int [] arr = new int [1001];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random()*100)+1;
			System.out.println(arr[i]);
		}


		
	}
}