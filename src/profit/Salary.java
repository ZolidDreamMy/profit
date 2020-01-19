package profit;

public class Salary {
	public double salary;
	public double sum;
	public double commission;
	
	public Salary(double salary, double commission) {
		this.salary = salary;
		this.commission = commission;
		setSum();
	}

	public double getSalary() {
		return salary;
	}

	public  void setSum() {
		this.sum= salary+commission;
	}
	
	public double getSum() {
		return sum;
	}
	public double checkSalary(double a) {
		
		if (a >100001) {
			if(salary<15000)
				return getSum()+3000;
		}
				return getSum();
	}
	


	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}
	public String toString() {
		return "Salary [salary=" + salary + ", commission=" + commission + "]";
	}


}
