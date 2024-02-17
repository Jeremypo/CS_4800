package polymorphism;

import java.util.ArrayList;
import java.util.List;

public class driver {
	public static void main(String[] args) {
		
		List<Ship> ships = new ArrayList<Ship>(3);
		
		Ship ship = new Ship();
		ship.setName("Jeremy");
		ship.setYearBuilt(2024);
		ships.add(ship);
		
		CruiseShip cruiseShip = new CruiseShip();
		cruiseShip.setName("V");
		cruiseShip.setYearBuilt(2025);
		cruiseShip.setMaxPassengers(1000);
		ships.add(cruiseShip);
		
		CargoShip cargoShip = new CargoShip();
		cargoShip.setName("Po");
		cargoShip.setYearBuilt(2026);
		cargoShip.setTonnage(2000);
		ships.add(cargoShip);
		
		for(Ship s : ships) {
			s.print();
		}
		
		/*
		List<Ship> ships = new ArrayList<Ship>(3);
	
		ships.add(new Ship("Jeremy", 2024));
		ships.add(new CruiseShip("V", 2025, 1000));
		ships.add(new CargoShip("Po", 2026, 2000));
		
		for(Ship s : ships) {
			s.print();
		}
		*/
	}

}
