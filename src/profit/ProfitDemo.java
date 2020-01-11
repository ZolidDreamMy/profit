package profit;
import java.util.Scanner;

public class ProfitDemo {

	public static void main(String[] args) {
		int id;
		char name;
		double salary,sumofsalary,profit,commission;
		Scanner sc = new Scanner(System.in);
		id = sc.nextInt();
		name = sc.next().charAt(0);
		salary = sc.nextDouble();
		sumofsalary = sc.nextDouble();
		commission = sc.nextDouble();
		
		Employee em = new Employee();
		em = new Employee("Suwijak",61113858);
		System.out.println(em.toString());
		if(salary<25000) {
			profit = (0.01*sumofsalary); 
		}else if(salary >= 25001 && salary <= 50000) {
			profit = (0.02*sumofsalary);
		}else if (salary >50000) {
			profit = (0.03*sumofsalary);
		}
		

	}

}
