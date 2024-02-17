package polymorphism;

public class Ship {
	private String name;
	private int yearBuilt;
	
	public Ship() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearBuilt() {
		return yearBuilt;
	}

	public void setYearBuilt(int yearBuilt) {
		this.yearBuilt = yearBuilt;
	}
	
	public void print() {
		System.out.println("Ship name: " + name);
		System.out.println("Year built: " + yearBuilt);
		System.out.println();
	}
}
