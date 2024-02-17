package inheritance;

public class CommissionEmployee extends Employee{
	private double commissionRate;
	private double grossSales;
	
	public CommissionEmployee() {
		super();	
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public String toString() {
		return super.toString() + commissionRate + " " + grossSales;
	}
}
