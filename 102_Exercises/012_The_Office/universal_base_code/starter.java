/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		
	
		
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		System.out.println("------------------------------");
		dwight.raiseSalary(1);
		System.out.print(dwight.getFirstName());
		System.out.print(" ");
		System.out.println(dwight.getLastName());
		System.out.println(dwight.getSalary());
		System.out.println(dwight.getAnnualSalary());
		System.out.println("------------------------------");
		
		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		System.out.println("------------------------------");
		jim.raiseSalary(1);
		System.out.print(jim.getFirstName());
		System.out.print(" ");
		System.out.println(jim.getLastName());
		System.out.println(jim.getSalary());
		System.out.println(jim.getAnnualSalary());
		System.out.println("------------------------------");
		
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250);
		System.out.println("------------------------------");
		pam.raiseSalary(1);
		System.out.print(pam.getFirstName());
		System.out.print(" ");
		System.out.println(pam.getLastName());
		System.out.println(pam.getSalary());
		System.out.println(pam.getAnnualSalary());
		System.out.println("------------------------------");
		
		Employee newone = new Employee(2008, "Matthew", "Park", 10000);
		System.out.println("------------------------------");
		newone.raiseSalary(10);
		System.out.print(newone.getFirstName());
		System.out.print(" ");
		System.out.println(newone.getLastName());
		System.out.println(newone.getSalary());
		System.out.println(newone.getAnnualSalary());
		System.out.println("------------------------------");
	}
}
