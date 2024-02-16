package inheritance;

import java.util.List;
import java.util.ArrayList;

public class driver {

	public static void main(String[] args) {
		List<Employee> staff = new ArrayList<Employee>();
		staff.add(new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500));
		staff.add(new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32));
		staff.add(new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47));
		staff.add(new CommissionEmployee("Nicole", "Dior", "444-44-4444", .15, 50000));
		staff.add(new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700));
		staff.add(new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000));
		staff.add(new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", .22, 40000));

		for(Employee e: staff) {
			System.out.println(e);
		}
	}

}
