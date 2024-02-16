package polymorphism;

public class CargoShip extends Ship{
	private int tonnage;
	
	public CargoShip(String name, int yearBuilt, int tonnage) {
		super(name, yearBuilt);
		this.tonnage = tonnage;
	}

	public int getTonnage() {
		return tonnage;
	}

	public void setTonnage(int tonnage) {
		this.tonnage = tonnage;
	}

	@Override
	public void print() {
		System.out.println("Ship name: " + super.getName());
		System.out.println("Cargo capacity: " + tonnage);
		System.out.println();
	}
}
