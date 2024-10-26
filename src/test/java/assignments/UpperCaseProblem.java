package assignments;

public class UpperCaseProblem {

	public static void main(String[] args) {
		String sentence = "Java programming is fun and challenging";
		String [] words = sentence.split(" ");
		String output ="";
		for(String word: words) {
			output=output+word.substring(0,1).toUpperCase()+word.substring(1)+" ";
		}
		System.out.println(output);
	}

}
