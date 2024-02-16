package polymorphism;

import java.util.ArrayList;
import java.util.List;

public class driver {
	public static void main(String[] args) {
		List<Ship> ships = new ArrayList<Ship>(3);
		ships.add(new Ship("Jeremy", 2024));
		ships.add(new CruiseShip("V", 2025, 1000));
		ships.add(new CargoShip("Po", 2026, 2000));
		
		for(Ship s : ships) {
			s.print();
		}
	}

}
