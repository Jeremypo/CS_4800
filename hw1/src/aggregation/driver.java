package aggregation;

public class driver {
	public static void main(String[] args) {
		Instructor nima = new Instructor();
		nima.setFirstName("Nima");
		nima.setLastName("Davarpanah");
		nima.setOfficeNumber("3-2636");
		
		Instructor jeremy = new Instructor();
		jeremy.setFirstName("Jeremy");
		jeremy.setLastName("Po");
		jeremy.setOfficeNumber("1-2345");
		
		Textbook cleanCode = new Textbook();
		cleanCode.setTitle("Clean Code");
		cleanCode.setAuthor("Robert Cecil Martin");
		cleanCode.setPublisher("Pearson");
		
		Textbook aot = new Textbook();
		aot.setTitle("Attack on Titan");
		aot.setAuthor("Eren Jaeger");
		aot.setPublisher("Finale");
		
		Course cs4800 = new Course();
		cs4800.setCourseName("CS 4800");
		cs4800.setInstructor(nima);
		cs4800.setTextbook(cleanCode);
		
		Course titan = new Course();
		titan.setCourseName("AOT 101");
		titan.setInstructor(jeremy);
		titan.setTextbook(aot);
		
		System.out.println(cs4800);
		System.out.println(titan);
	}

}
