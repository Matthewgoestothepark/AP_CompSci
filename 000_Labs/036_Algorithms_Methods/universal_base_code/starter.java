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
		int [] x = new int [100];
		for(int i = 0; i < x.length; i++){
			x[i] = (int)(Math.random()*100)+1;
		}
		toStringArray(x);
		
		System.out.println("The max of 100 random values is " + getArrayMax(x));
		System.out.println("The min of 100 random values is " + getArrayMin(x));
		System.out.println("The average of 100 random values is " + getArrayAverage(x));

		
	}
	
	
	public static void toStringArray(int [] arr) {
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
	
	public static int getArrayAverage(int [] arr){
		int storage = 0; 
		for(int i=0; i < arr.length; i++){
			storage=storage+arr[i];
		}
		return storage/arr.length;
	}
	
	public static int getArrayMax(int [] arr){
		int max = arr[0];
		for(int i = 1; i < arr.length; i++){
			if (arr[i] > max){
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int getArrayMin(int [] arr){
		int min = arr[0];
		for(int i = 1; i<arr.length-1; i++){
			if (arr[i] < min){
				min = arr[i];
			}
		}
		return min;
	}
}
