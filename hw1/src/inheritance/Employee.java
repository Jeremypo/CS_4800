package hw1.src.inheritance;

public class Employee {
	private String firstName;
	private String lastName;
	private String ssn;
	
	public Employee() {}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public String toString() {
		return firstName + " " + lastName + " " + ssn + " ";
	}
}
