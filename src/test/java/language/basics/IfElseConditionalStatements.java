package language.basics;

public class IfElseConditionalStatements {

	public static void main(String[] args) {
		
		boolean isPrabashMovieAvailable = false;
		boolean isKaveenMovieAvailable = false;
		boolean isDulakarMovieAvailable = true;
		
		boolean isBalconyAvailable = false;
		
		if(isPrabashMovieAvailable) {
			System.out.println("Prabash Movie Available");
			if(isBalconyAvailable) {
				System.out.println("Book Balcony ticket for Prabash Movie");
			}else {
				System.out.println("Book Normal ticket for Prabash Movie");
			}
		}else if(isKaveenMovieAvailable) {
			System.out.println("Kaveen Movie Available");
			if(isBalconyAvailable) {
				System.out.println("Book Balcony ticket for Kaveen Movie");
			}else {
				System.out.println("Book Normal ticket for Kaveen Movie");
			}
		}else if(isDulakarMovieAvailable) {
			System.out.println("Dulkar Movie Available");
			if(isBalconyAvailable) {
				System.out.println("Book Balcony ticket for Dulkar Movie");
			}else {
				System.out.println("Book Normal ticket for Dulkar Movie");
			}
		}else {
			System.out.println("No Ticket available, Go Home");
		}

	}

}
