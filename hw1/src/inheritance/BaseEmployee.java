package hw1.src.inheritance;

public class BaseEmployee extends Employee{
	private double baseSalary;

	public BaseEmployee() {
		super();
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public String toString() {
		return super.toString() + baseSalary;
	}
}
