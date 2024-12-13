/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Dog kevin = new Dog("Kevin");
		kevin.setAge(9);
		boolean x = kevin.isSleeping();
		if(x){
			kevin.bark();
		}
		else{
			System.out.println("Kevin is sleeping");
		}
		
		Dog rastin = new Dog("Rastin", "Indian");

		if(x){
			rastin.bark();
		}

	}
}
