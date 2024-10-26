package assignments;

public class OccurancesProblem {

	public static void main(String[] args) {
		String paragraph = "Java is a popular programming language. Java is used for web development, mobile applications, and more.";
		String [] words = paragraph.split(" ");
		int occurances =0;
		for(int i=0; i<words.length; i++) {
			if(words[i].equals("Java")) {
				occurances++;
				System.out.println(occurances+" - occurance value Index is "+i);
			}			
		}
		System.out.println("Total occurances : "+ occurances);

	}

}
