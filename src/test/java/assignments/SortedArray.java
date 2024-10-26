package assignments;

public class SortedArray {
	
	//Given values are 12 ,34,11,36,87,98,93.
	//Print second and third largest number from the above values without using default sort method

	public static void main(String[] args) {
		
		int [] numbers = {12 ,34,11,36,87,98,93};
		
		for (int i=0; i<numbers.length-1 ; i++) {
			
			for (int j =0; j< numbers.length-1 -i ; j++) {
				
				if (numbers [j] > numbers [j+1]) {
					int temp = numbers [j];
					numbers[j] = numbers [j+1];
					numbers [j+1] = temp;
					
				}
			}
		}
	
System.out.println(numbers[numbers.length-2]);
System.out.println(numbers[numbers.length-3]);
	}

}
