//package profit;
import java.util.Scanner;
import java.util.ArrayList;

public class ProfitDemo {

	public static void main(String[] args) {
		String id;
		String name;
		int i = 0;
		double salary,sales,profits = 0,commission,sum=0 ;
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> em = new ArrayList<Employee>();
		ArrayList<Salary> sa = new ArrayList<Salary>();
		char ch = 0;
		do {
			System.out.print("Name :");
			name = sc.next();
			System.out.print("ID : ");
			id = sc.next();
			System.out.print("Salary :");
			salary = sc.nextDouble();
			System.out.print("Top sale :");
			sales = sc.nextDouble();
			
			em.add( new Employee(name, id));
			
			if(sales<50001) {
				profits = (0.01*sales);
				sum = profits+salary;
<<<<<<< HEAD
				sa.add(new Salary(salary,sum));
			}else if(sales >= 50001 && sales <= 100000) {
				profits = (0.02*sales);
				sum = profits+salary;
				sa.add(new Salary(salary,sum));
			}else if (sales >100001) {
=======
				sa.add(new Salary(salary,profits));
			}else if(sales >= 25001 && sales <= 50000) {
				profits = (0.02*sales);
				sum = profits+salary;
				sa.add(new Salary(salary,profits));
			}else if (sales >50000) {
>>>>>>> origin/projectB
				profits = (0.03*sales);
				sum = profits+salary;
				sa.add(new Salary(salary,profits));
			}
			
			
			
			
			System.out.print("Do you want to continues[y/n]: ");
			
			ch = sc.next().charAt(0);
		}while(ch=='y');
		for( i=0;i<em.size();i++) {
			System.out.println(em.get(i).toString()	);
			System.out.println("Salary received : "+sa.get(i).checkSalary(sales));
		}

	}

}