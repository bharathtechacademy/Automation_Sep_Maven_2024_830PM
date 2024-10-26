package access.mod1;
//with in the package
public class AccessMod2 {

	public static void main(String[] args) {
		AccessMod1 obj = new AccessMod1();
		System.out.println(obj.name);
		obj.printRole();
	}

}
