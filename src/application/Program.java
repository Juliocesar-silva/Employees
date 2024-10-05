package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import entities.Employees;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		List<Employees> list = new ArrayList<>();
		
		System.out.println("How many employees will be registered? ");
		int registed = scan.nextInt();
		
		for(int i = 0; i < registed; i ++) {
			
			System.out.println("Type the ID of employee: ");
			int id_register = scan.nextInt();
			
			System.out.println("Type the name of employee: ");
			String name_register = scan.next();
			
			System.out.println("Type the salary of employee: ");
			double salary_register = scan.nextDouble();
			
			list.add(new Employees(id_register,name_register,salary_register));
		}
		
		System.out.println("Employees Registed");
		for(Employees employees : list) {
			employees.viewEmployees();
		}
		
		System.out.println("Type the id of employeer that will have salary increase: ");
		int id_increase = scan.nextInt();
		
		System.out.println("Type percent: ");
		double percent_increase = scan.nextDouble();
		
		for(Employees employees : list) {
			employees.increaseSalary(id_increase, percent_increase);
		}
	
		scan.close();
	}

}
