package pack;

import java.util.Scanner;

/**
 * Class : Employee used to call main Method.
 */
public class Employee {

	public static void main(String[] args) {
		/*Use Of Scanner class for user input*/
		
	Scanner no = new Scanner(System.in);
	System.out.println("Enter the no. of Employees");
	int n = no.nextInt();
	
	for(int i=0 ; i < n ; i++)
		{	
		Scanner sl = new Scanner(System.in);
		System.out.println("Enter Basic Salary");
		float basicSalary = sl.nextFloat();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter leaves taken");
		int leaves = sc.nextInt();
		
		Salary sal = new Salary();
		/*Handling the exception*/ 
		try{
			sal.countLeaves(leaves); //calling of count leaves method
		   }
		catch(Exception e){
			System.out.println(e);
		   }
	    
		sal.calcSalary(basicSalary);//calling of calcSalary method
	    }
		System.out.println("Salaries of all the employees are calculated.ThankYou");
		no.close();
		}
}
