package pack;

class Salary extends Calculation {
	float basicSalary;
	int leaves;

	Salary() { // constructor used for initializing the object
		this.basicSalary = 15000;
		this.leaves = 15;
	}

	// Calculation of salary
	public void calcSalary(float basicSalary) {
		float da = basicSalary * 15 / 100;
		float hra = basicSalary * 10 / 100;
		float gross_sal = basicSalary + da + hra;
		System.out.println("salary" + gross_sal);
	}

	// Calculation of leaves
	void countLeaves(int leaves) throws MoreThan15Leave {

		if (leaves > 15){
			throw new MoreThan15Leave("not valid");// If leaves greater than 15 then throw exception
		}
		else{
			System.out.println("Valid");
		    }		
	}
}