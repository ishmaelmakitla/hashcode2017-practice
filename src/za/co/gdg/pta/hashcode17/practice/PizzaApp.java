package za.co.gdg.pta.hashcode17.practice;

public class PizzaApp {

	public static void main(String[] args) {
		//get the input file and pass it to the parser for processing
		PizzaProblemObject problemObject = PizzaInputFileParser.parse("small.in");
		//testing if our parser worked
		problemObject.print();
		
		problemObject.as2D();

	}

}
