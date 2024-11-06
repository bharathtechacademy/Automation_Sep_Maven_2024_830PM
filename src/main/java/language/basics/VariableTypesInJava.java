package language.basics;

public class VariableTypesInJava {
	
	// DataType Variable = Data ;
	
	//Local Variable  ==> The variable declared inside the method
	//Instance Variable ==> The variable created outside of the method and with in the class ==> can be accessed by creating Instance of class
	//Global Variables ==>  The variable created outside of the method and with in the class along with static keyword
	
	String city = "Hyderabad"; //Instance variable
	
	static String state = "Telangana"; //Global Variable

	public static void main(String[] args) {	
		
		String name = "Bharath"; //Local variable we can't access out side of the method		
		System.out.println(name);
		
		VariableTypesInJava obj = new VariableTypesInJava();//new instance /object
		System.out.println(obj.city);
		
		System.out.println(state);
	}


	
	
}
