package polymorphism;

public class CruiseShip extends Ship{
	private int maxPassengers;
	
	public CruiseShip(String name, int yearBuilt, int maxPassengers) {
		super(name, yearBuilt);
		this.maxPassengers = maxPassengers;
	}

	public int getMaxPassengers() {
		return maxPassengers;
	}

	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}
	
	@Override
	public void print() {
		System.out.println("Ship name: " + super.getName());
		System.out.println("Max passengers: " + maxPassengers);
		System.out.println();
	}

}
