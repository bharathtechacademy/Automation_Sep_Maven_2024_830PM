package language.basics;

public class ForEachLoop {

	public static void main(String[] args) {
		
		String [] empNames = new String [4];
		empNames[0] ="Sravan";
		empNames[1] ="Ravali";
		empNames[2] ="Chinnu";
		empNames[3] ="Sanjay";
		
//		for (int i=0; i<empNames.length ; i++) {
//			System.out.println(empNames[i]);
//		}
		
		
		for (String val : empNames) {
			System.out.println(val);
		}


	}

}
