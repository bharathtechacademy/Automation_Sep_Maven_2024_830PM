package staticNonAccsMod;

public class StaticClass1 {
	
	//static can be used before the data and method
	
	public static String name = "Chinnu";
	
	public static void printRole() {
		System.out.println("Quality Engineer");
	}

	public static void main(String[] args) {
		StaticClass1 obj = new StaticClass1();		
		System.out.println(name);
		printRole();
	}

}
