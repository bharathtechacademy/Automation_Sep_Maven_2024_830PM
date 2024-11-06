package functionalInterfacesPack;

import java.util.function.Consumer;

public class DefaultFunctionalInterfaces4 {

	public static void main(String[] args) {
	
//		DefaultFunctionalInterfaces4 obj = new DefaultFunctionalInterfaces4();
//		obj.printUpperCase("Shiva Kumar");
//		obj.printUpperCase("Pricilla Reddy");
		
		Consumer<String> output = input -> {System.out.println(input.toUpperCase());};
		output.accept("Shiva Kumar");
		output.accept("Pricilla Reddy");

	}
	
	public void printUpperCase(String input) {
		String upperCaseValue = input.toUpperCase();
		System.out.println(upperCaseValue);
	}

}
