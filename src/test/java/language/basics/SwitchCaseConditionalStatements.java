package language.basics;

public class SwitchCaseConditionalStatements {

	public static void main(String[] args) {
		
		String env = "PROD1";
		
		switch(env) {
		
		case "DEV" :
			System.out.println("Launch the dev app");
			System.out.println("Enter dev credentials");
			break;
		case "QA" :
			System.out.println("Launch the QA app");
			System.out.println("Enter QA credentials");
			break;
		case "PROD" :
			System.out.println("Launch the PROD app");
			System.out.println("Enter PROD credentials");
			break;
		default:
			System.out.println("Invalid Environment");
		
		
		}

	}

}
