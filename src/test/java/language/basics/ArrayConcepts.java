package language.basics;

public class ArrayConcepts {
	
	static String state = "Tamilnadu";

	public static void main(String[] args) {
	
		//1 Dimensional Array
		String [] empNames = new String [3];
		empNames[0] ="Sravan";
		empNames[1] ="Ravali";

		
		
		System.out.println(empNames.length); //how many values allowed
		
//		empNames[3] ="Ravi";
		
		System.out.println(empNames[2]);
		
		//2 Dimensional Array
		String [][] empGroups = new String [3][2];
		empGroups[0][0] ="Sravan";
		empGroups[0][1] ="Teja";
		
		empGroups[1][0] ="Ravali";
		empGroups[1][1] ="Pratap";
		
		empGroups[2][0] ="Mohit";
		empGroups[2][1] ="Satya";
		
		System.out.println(empGroups[2][1]);//Teja
		
		int [] empids = {1,2,3};
		
		System.out.println(empids[1]); //2
		
		//3D Array 
		
		String [][][] companies = new String [4][2][4];
		
		//1st company 2nd project 3rd employee is "Hima Bindhu"
		
		companies [0][1][2] = "Hima Bindhu";
		
		System.out.println(empids);
		

	}

}
