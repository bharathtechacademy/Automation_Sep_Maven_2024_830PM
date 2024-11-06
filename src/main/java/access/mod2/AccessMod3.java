package access.mod2;
//outside of package
import access.mod1.AccessMod1;

public class AccessMod3 extends AccessMod1{ //child extends parent

	public static void main(String[] args) {
		AccessMod3 obj = new AccessMod3();
		System.out.println(obj.name);
		obj.printRole();
//		System.out.println(obj.getName());
	}

}
