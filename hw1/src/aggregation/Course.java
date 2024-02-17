package aggregation;

public class Course {
	private String courseName;
	private Instructor instructor;
	private Textbook textbook;
	
	public Course() {}
	
	public String toString() {
		return courseName + "\n" 
				+ instructor.getFirstName() + " " + instructor.getLastName()+ ", " + instructor.getOfficeNumber() + "\n"
				+ textbook.getTitle() + ", " + textbook.getAuthor() + ", " + textbook.getPublisher()
				+ "\n";
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public Textbook getTextbook() {
		return textbook;
	}

	public void setTextbook(Textbook textbook) {
		this.textbook = textbook;
	}

}
