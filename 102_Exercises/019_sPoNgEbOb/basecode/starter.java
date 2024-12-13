/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in); 
	System.out.println("Please enter a word or phrase: ");
	String x = sc.nextLine();
	
	while(true){
		if(x.indexOf(" ") == -1){
			System.out.print(spongeCase(x) + " ");
			break;
		}
		
		int space = x.indexOf(" "); 
		String word = x.substring(0, space);
		System.out.print(spongeCase(word) + " "); 
		
		x = x.substring(space+1);
	}
	
	//System.out.println("");
	//System.out.println("Your word/phrase as sPoNgE cAsE:"); 
	//System.out.println(storage); 
	
	}
	
	public static String spongeCase(String word){
		
		String storage = "";
		for(int i = 0; i < word.length(); i++){
			String letter = word.substring(i, i+1); 
			if(i % 2 == 0){
				String lowerX = letter.toLowerCase(); 
				storage = storage + lowerX; 
			} 
			else{
				String upperX = letter.toUpperCase(); 
				storage = storage + upperX;
			}
		}
		return storage; 
	}
}
