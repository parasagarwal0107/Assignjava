package pack;

class Salary extends Calculation {
	float basicsalary;
	int leaves;

	Salary() { // constructor used for initializing the object
		this.basicsalary = 150000;
		this.leaves = 15;
	}

	// Calculation of salary
	public void calcSalary() {

		float basicSalary;
		float da = this.basicsalary * 15 / 100;
		float hra = this.basicsalary * 10 / 100;
		float gross_sal = this.basicsalary + da + hra;
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