package exceptionHandling;

public class ThrowAnException {

	public static void main(String[] args) throws Exception {

		int age = 18;

		if (age < 0) {
			throw new Exception("Invalid Age Exception");
		} else if (age < 18) {
			throw new Exception("Not Eligible to Vote Exception");
		} else {
			System.out.println("Eligible to Vote");
		}

		System.out.println("Execution Completed");
	}

}
