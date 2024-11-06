package functionalInterfacesPack;

import java.util.function.Predicate;

public class DefaultFunctionalInterfaces {

	public static void main(String[] args) {
		
//		System.out.println(statusToCheckEmptyValue("")); //true
//		System.out.println(statusToCheckEmptyValue("Venkat")); //false
		
		Predicate<String> checkEmptyValue = input -> input.isEmpty();
		System.out.println(checkEmptyValue.test(""));
		System.out.println(checkEmptyValue.test("Venkat"));
		
	}
	
	
//	public static boolean statusToCheckEmptyValue(String input) {
//		boolean status = false;
//		if(input.isEmpty()) {
//			status = true;
//		}
//		return status;
//	}

}
