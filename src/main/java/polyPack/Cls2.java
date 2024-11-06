package polyPack;

public class Cls2 extends Cls1{
	
	String name = "Siva";
	
	public void printName(String name) {
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);
	}

	public static void main(String[] args) {
		Cls2 obj = new Cls2();
		obj.printName("Ravi");
	}

}
