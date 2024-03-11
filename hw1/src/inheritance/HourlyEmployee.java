package hw1.src.inheritance;

public class HourlyEmployee extends Employee{
	private double wage;
	private double hoursWorked;
	
	public HourlyEmployee() {
		super();	
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public String toString() {
		return super.toString() + wage + " " + hoursWorked;
	}
}
