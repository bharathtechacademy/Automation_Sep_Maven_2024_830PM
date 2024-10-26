package staticNonAccsMod;

public class StaticClass2 {

	public static void main(String[] args) {
		StaticClass1 obj = new StaticClass1();
		System.out.println(StaticClass1.name);
		StaticClass1.printRole();
	}

}
