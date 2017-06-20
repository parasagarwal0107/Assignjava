package pack;

import java.util.Scanner;

/**
 * Class : Employee used to call main Method.
 */
public class Employee {

	public static void main(String[] args) {
		
		/*Use Of Scanner class fo user input*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter leaves taken");
		int leaves = sc.nextInt();

		Salary sal = new Salary();
		/*Handling the exception*/ 
		try
		{
			sal.countLeaves(15); //calling of countleaves method
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	    sal.calcSalary(); //calling of calcSalary method
	}
}
