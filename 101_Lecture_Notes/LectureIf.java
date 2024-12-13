/* 
    Lecture note example - If Statements
*/
import java.util.Scanner;

class LectureIf{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("You are now in World War II");
        System.out.println("What way would you like to start your World War II adventure?");
        System.out.println("1. Behind Enemy Lines: You’re a spy infiltrating a German stronghold. Your mission: gather intelligence on a secret weapon.");
        System.out.println("2. The Resistance Fighter: As a member of the French Resistance, you must decide whether to sabotage a train carrying troops or rescue a captured comrade.");
        System.out.println("3. The Soldier’s Choice: You’re a soldier on the front lines in Europe. You can either advance on a critical enemy position or retreat to save your wounded comrades.");
        
        int answer = sc.nextInt();
        if(answer == 1){
            System.out.print("As you gather intelligence, you get shot by a German soldier and die");    
        }
        else if(answer == 2){
            System.out.print("As you rescue your comrade, the train runs you over");
        }
        else if(answer == 3){
            System.out.print("You decide to retreat and save your comrade,but the enemy chases you down and kills you");
        
        }
        else{
            System.out.print("I will deep dive into if you dont answer correctly");
        }
	}
}