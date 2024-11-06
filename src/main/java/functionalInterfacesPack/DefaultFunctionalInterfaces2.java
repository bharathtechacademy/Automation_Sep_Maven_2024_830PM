package functionalInterfacesPack;

import java.util.function.Function;

public class DefaultFunctionalInterfaces2 {

	public static void main(String[] args) {
//		DefaultFunctionalInterfaces2 obj = new DefaultFunctionalInterfaces2();
//		System.out.println(obj.cube(2));
//		System.out.println(obj.cube(5));
		
		Function<Integer, Integer> cube = input -> input*input*input;
		System.out.println(cube.apply(2));
		System.out.println(cube.apply(5));
		
	}
	
//	public int cube(int input) {
//		int output = input* input* input;
//		return output;
//	}

}
