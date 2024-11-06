package language.basics;

public class WhileLoop {

	public static void main(String[] args) {
		
//		while (condition) {
//			//condition to break the loop
//			
//			//statements to execute
//		}
		
		int i = 1; 
		boolean isPageAvailable = false;
		
		
		while (i>0) {		
			
			if(isPageAvailable || i>100) {
				break; //jumping statement (break the loop completely)
			}
			
			System.out.println("Refresh the Page");
			
			i++;
			
		}

	}

}
