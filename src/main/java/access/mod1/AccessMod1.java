package access.mod1;
//with in class
public class AccessMod1 {
	
	//public  ==> object can be accessed any where in the project
	
	public String name = "Chinnu";
	
	public void printRole() {
		System.out.println("Quality Engineer");
	}
	
	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		AccessMod1 obj = new AccessMod1();
		System.out.println(obj.name);
		obj.printRole();
	}

}
