package inheritance;

public class SalariedEmployee extends Employee{
	private double weeklySalary;
	
	public SalariedEmployee() {
		super();	
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	
	public String toString() {
		return super.toString() + weeklySalary;
	}

}
