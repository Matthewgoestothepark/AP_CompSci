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
		int [] arr = new int [(int)(Math.random()*150)+51];
		System.out.println("There are " + arr.length + " elements");
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random()*100)+1;
		}
		
		int max = arr[0];
		for(int i = 0; i < arr.length; i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		System.out.println("The maximum of " + arr.length + " random numbers is " + max);
		
		
		int min = Integer.MAX_VALUE; 
		for(int i = 0; i < arr.length; i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}
		System.out.println("The minimum of " + arr.length + " random numbers is " + min);
		
		int avg = 0; 
		for(int i = 0; i < arr.length; i++){
			avg = avg + arr[i];
		}
		System.out.print("The average of " + arr.length + " random numbers is " + avg/arr.length);
		
		
	
		
		

		
	}
}
