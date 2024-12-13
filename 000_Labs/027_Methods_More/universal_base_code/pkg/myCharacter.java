/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	String role; 
	int strength; 
	int dexterity; 
	int intelligence; 
	int constitution; 
	int charisma; 
	
	public myCharacter() {
		role = "No Role";
		strength = 0; 
		dexterity = 0; 
		intelligence = 0; 
		constitution = 0; 
		charisma = 0; 
	}
	
	public myCharacter(String a){
		if (a.equals("Wizard") || a.equals("wizard")){
			System.out.println("You've chosen the Wizard! Excelsior!");
			role = a; 
		}
		else if (a.equals("Rogue") || a.equals("rogue")){
			System.out.println("You've chosen the Rogue! How cunning!");
			role = a; 
		}
		else if (a.equals("Warrior") || a.equals("warrior")){
			System.out.println("You've chosen the Warrior! For honor!");
			role = a; 
		}	
		else{
			System.out.println("That is not one of the roles!");
			role = "No role";
		}
	
	}
	public String getRole(){
		return role; 
	}
	
	public int setStrength(int strength){
		if(strength < 0){
			strength = 0; 
		}
		return strength; 
	}
	
	public int setDexterity(int dexterity){
		return dexterity;
	}
	
	public int setIntelligence(int intelligence){
		return intelligence;
	}
	
	public int setCharisma(int charisma){
		return charisma;
	}
	
	public int setConstitution(int constitution){
		return constitution;
	}
	
	public boolean setAll(String role, int strength, int dexterity, int intelligence, int constitution, int charisma){
		return true;
	}
	
	public void myToString(){
		System.out.println("Your role is " + role);
		System.out.println("Your strength trait is " + strength);
		System.out.println("Your dexterity trait is " + dexterity);
		System.out.println("Your intelligence trait is " + intelligence); 
		System.out.println("Your constitution trait is " + constitution);
		System.out.println("Your charisma trait is " + charisma);
	}

}

