package finalPack;

public  class FinalClass1 {
	
	//final non-access modifier 
	
	//final ==> class, method and data
	
	//final can't allow modifications
	
	
	final String name = "Bharath";
	
	public void changeName(String newName) {
//		name = newName;
		System.out.println("Updated name as "+ name);
	}
	
	public void printName() {
		System.out.println(name);
	}
	


}
