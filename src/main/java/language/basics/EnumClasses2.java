package language.basics;

enum result {
	ZERO(0),
	ONE(1);
	
	private final int value;
	
	result(int val){
		this.value = val;
	}
	
	public int getValue() {
		return value;
	}
}

public class EnumClasses2 {

	
	public static void main(String[] args) {
		
//		for (result val: result.values()) {
//			System.out.println(val.getValue());
//		}
		
		System.out.println(result.ONE.getValue());
		

	}

}
