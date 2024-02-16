package aggregation;

public class driver {
	public static void main(String[] args) {
		Instructor nima = new Instructor("Nima", "Davarpanah", "3-2636");
		Instructor jeremy = new Instructor("Jeremy", "Po", "1-2345");
		
		Textbook cleanCode = new Textbook("Clean Code", "Robert Cecil Martin", "Pearson");
		Textbook aot = new Textbook("Attack on Titan", "Eren Jaeger", "Finale");
		
		Course cs4800 = new Course("CS 4800", nima, cleanCode);
		Course titan = new Course("AOT 101", jeremy, aot);
		
		System.out.println(cs4800);
		System.out.println(titan);
	}

}
