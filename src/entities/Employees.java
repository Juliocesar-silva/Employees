package entities;

public class Employees {
	
	private int id;
	private String name;
	private double salary;
	
	public Employees(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void viewEmployees() {
		System.out.printf("ID: %d, Name: %s, Salary: %.3f%n",id,name,salary);
	}
	
	public void increaseSalary(int id, double percent) {
		if(this.id == id) {
			double result = (percent/100) + 1;
			double new_salary = result * salary;
			System.out.printf("Salary increase: %.3f%n",new_salary);
		}
	}
}
