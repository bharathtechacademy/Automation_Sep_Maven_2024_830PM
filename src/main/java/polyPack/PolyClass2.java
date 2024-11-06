package polyPack;

public class PolyClass2 extends PolyClass1{
	

	public void sumOfNumbers(int num1, int num2) {
		System.out.println(num1+num2);
	}
		
	public void sumOfNumbers(int val1, int val2, int val3) {
		System.out.println(val1+val2+val3);
	}

	public static void main(String[] args) {
		PolyClass2 obj = new PolyClass2();
		obj.sumOfNumbers(1, 2);
		
//		System.out.println("Bharath");
//		System.out.println(123);
//		System.out.println(true);

	}

}
