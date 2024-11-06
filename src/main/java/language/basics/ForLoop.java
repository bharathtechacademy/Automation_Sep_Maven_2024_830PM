package language.basics;

public class ForLoop {

	public static void main(String[] args) {
		
		// condition1 ==> where to start the loop
		// condition2 ==> where to stop the loop
		// condition3 ==> interval between each loop
		
//		for(condition1 ; condition2 ; condition3) {
//			//statements to iterate
//		}
		
		String name = "Bharath";
		
		//print name for 10 times		
		for(int i=1; i<=10 ; i++) {
			System.out.println(i+"."+name);
		}

	}

}
