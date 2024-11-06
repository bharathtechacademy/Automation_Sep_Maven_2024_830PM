package functionalInterfacesPack;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsAPI {

	public static void main(String[] args) {

		// input = {1,2,3,4,5,6,7,8};

		List<Integer> inputList = List.of(1, 2, 3, 4, 5, 6, 7, 8);

//		List<Integer> outPutList = new ArrayList<Integer>();
//
//		for (int i : inputList) {
//
//			if (i % 2 == 0) {
//				outPutList.add(i);
//			}
//		}
//
//		System.out.println(outPutList);
		
		List<Integer> outPutList = inputList.stream().filter( i -> i%2!=0).collect(Collectors.toList());
		System.out.println(outPutList);
	}

}
