/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
	
	
	//part 1 
	int [] arr = new int [20];
	System.out.println("----------------------------------------------------");
	System.out.println("These are the " + arr.length + " numbers");
	for(int i = 0; i < arr.length; i++){
		arr[i] = (int)(Math.random()*10)+1;
		System.out.print(arr[i] + " ");
	}
	System.out.println("");
	System.out.println("----------------------------------------------------");
	
	
	//part 2
	int randomnum = arr[(int)(Math.random()*20)+1];
	int storage = 0; 
	System.out.println("The random number to look for is " + randomnum);
	for(int i = 0; i < arr.length; i++){
		if(randomnum == arr[i]){
			storage++;
			System.out.println("Duplicate found at index " + i);
		}
	}
	if(storage == 0){
		System.out.println("The total number of duplicates for " + randomnum + " is " + storage);
	}
	System.out.println("The total number of duplicates for " + randomnum + " is " + storage);
	System.out.println("----------------------------------------------------");
	
	
	//part3
	System.out.println("Looking for two in a row:");
	for(int i = 1; i < arr.length; i++){
		if(arr[i] == arr[i-1]){
			System.out.println("Two in a row found at indexes " + (i-1) + " and " + i + ". The number is " + arr[i]);
		}
	}

	
	}
}