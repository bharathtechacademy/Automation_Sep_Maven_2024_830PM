package exceptionHandling;

public class TryCatchExceptionHandling {

	public static void main(String[] args) {

		String[] empNames = new String[3];

		try {
			empNames[0] = "Sravan";
			empNames[1] = "Ravali";
			empNames[2] = "Pricilla";
			empNames[3] = "Ravi";
		} catch (ArrayIndexOutOfBoundsException lakshmi) {
			System.out.println("Try block fails with error " + lakshmi.getMessage());
			empNames[3] = ""
					+ "Teja";
		} catch (NullPointerException lakshmi) {
			System.out.println("Try block fails with error " + lakshmi.getMessage());
			empNames[3] = "Teja";
		} finally {
			System.out.println("Execution Completed");
		}

	}

}
