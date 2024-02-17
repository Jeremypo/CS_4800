package polymorphism;

public class CruiseShip extends Ship{
	private int maxPassengers;
	
	public CruiseShip() {
		super();
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
