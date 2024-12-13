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
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter a sentence."); 
		String x = sc.nextLine(); 
		String storage = ""; 
		
		
		while(true){
            if(x.indexOf(" ") == -1){
                System.out.print(x + " "); 
                break; 
            }
            int space  = x.indexOf(" ");
            String word = x.substring(0, space);
            storage = word + " " + storage;  
            x = x.substring(space+1);
        }
        System.out.print(storage); 


		
	}
}
