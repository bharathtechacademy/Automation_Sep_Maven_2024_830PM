package language.basics;

public class DebugTheProgram {
	
	
	//last line of error always refer line number along with hyperlink where we got an error
	//first line of error always refer "what is the error " and location of error documentation
	
	//double click on line number to add break point
	

	public static void main(String[] args) { 
		int i=1;
		System.out.println("Step 1");
		System.out.println("Step 2");
		System.out.println("Step 3");
		int j=i+1;
		System.out.println(i/j);
		System.out.println("Step 5");
		System.out.println("Execution Completed");	

	}


}
