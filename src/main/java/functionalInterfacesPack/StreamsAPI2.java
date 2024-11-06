package functionalInterfacesPack;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsAPI2 {

	public static void main(String[] args) {
		List<String> inputList = List.of("Shiva","Pricilla","Bharath");
		
		List<String> outputList = new ArrayList<String>();
		
		for(String input : inputList) {
			String output = input.toUpperCase();
			outputList.add(output);			
		}
		
//		List<String> outputList  = inputList.stream().map(String ::toUpperCase).collect(Collectors.toList());
//		
		System.out.println(outputList);

	}

}
