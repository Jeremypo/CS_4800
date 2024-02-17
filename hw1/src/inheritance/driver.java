package inheritance;

import java.util.List;
import java.util.ArrayList;

public class driver {

	public static void main(String[] args) {
		List<Employee> staff = new ArrayList<Employee>();
		
		SalariedEmployee e1 = new SalariedEmployee();
		e1.setFirstName("Joe");
		e1.setLastName("Jones");
		e1.setSsn("111-11-1111");
		e1.setWeeklySalary(2500);
		staff.add(e1);
		
		HourlyEmployee e2 = new HourlyEmployee();
		e2.setFirstName("Stephanie");
		e2.setLastName("Smith");
		e2.setSsn("222-22-2222");
		e2.setWage(25);
		e2.setHoursWorked(32);
		staff.add(e2);
		
		HourlyEmployee e3 = new HourlyEmployee();
		e3.setFirstName("Mary");
		e3.setLastName("Quinn");
		e3.setSsn("333-33-3333");
		e3.setWage(19);
		e3.setHoursWorked(47);
		staff.add(e3);
		
		CommissionEmployee e4 = new CommissionEmployee();
		e4.setFirstName("Mary");
		e4.setLastName("Quinn");
		e4.setSsn("333-33-3333");
		e4.setCommissionRate(.15);
		e4.setGrossSales(50000);
		staff.add(e4);
		
		SalariedEmployee e5 = new SalariedEmployee();
		e5.setFirstName("Renwa");
		e5.setLastName("Chanel");
		e5.setSsn("555-55-5555");
		e5.setWeeklySalary(1700);
		staff.add(e5);
		
		BaseEmployee e6 = new BaseEmployee();
		e6.setFirstName("Mike");
		e6.setLastName("Davenport");
		e6.setSsn("666-66-6666");
		e6.setBaseSalary(95000);
		staff.add(e6);

		CommissionEmployee e7 = new CommissionEmployee();
		e7.setFirstName("Mahnaz");
		e7.setLastName("Vaziri");
		e7.setSsn("777-77-7777");
		e7.setCommissionRate(.22);
		e7.setGrossSales(40000);
		staff.add(e7);
		
		for(Employee e: staff) {
			System.out.println(e);
		}
		
		/*
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
		*/
	}
}
