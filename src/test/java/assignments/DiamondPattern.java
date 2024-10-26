package assignments;

public class DiamondPattern {

	public static void main(String[] args) {
		
		int rows = 5; 
		
		//to print 5 rows
		for (int i=1 ; i <=5; i++) {
			
			//print spaces
			for(int j= i; j<rows ; j++) {
				System.out.print(" ");
			}
			
			//print numbers
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			
			//print reverse numbers
			for(int j= i-1;j>=1;j--) {
				System.out.print(j);
			}
			
			//move to next row
			System.out.println();
			
		}
		
		
		for(int i = rows -1 ; i>=1;i--) {
			
			
			//print spaces
			for(int j= rows; j>i ; j--) {
				System.out.print(" ");
			}
			
			//print numbers
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			
			//print reverse numbers
			for(int j= i-1;j>=1;j--) {
				System.out.print(j);
			}
			
			//move to next row
			System.out.println();
			
		}
		
		

	}

}
