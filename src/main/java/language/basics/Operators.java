package language.basics;

public class Operators {
	
	//Operators ==> Special chars used in programming
	
	//1. Arithmetic Operators ==> Special chars used to perform mathematical operations ==>  +, -, *, / , % , ++ (increment by 1) , -- (decrement by 1)
	//2. Assignment Operators ==> assign value to variable ==> = , +=, -=, *=, /=, %=
	//3. Conditional Operators ==> to compare values  ==> ==, !=, > , < , >=, <=
	//4. Logical Operators  ==> to build logics ==> && (and), || (or) , ! (not)
	//5. Ternary Operator ==>  to decide the result based on condition ==>  ?
	
	public static void main(String[] args) {
		
		//1. Arithmetic Operators ==> Special chars used to perform mathematical operations ==>  +, -, *, / , % , ++ (increment by 1) , -- (decrement by 1)
		
		int a = 10;
		int b = 20;
	
//		System.out.println(a++); //a++ ==>  post-increment ==> post execution of this line then increase the value by 1
//		System.out.println(a);
//		System.out.println(b--); //b-- ==> post-decrement ==> post execution of this line then decrease the value by 1
		
//		System.out.println(++a); //a++ ==>  pre-increment ==> before execution of this line increase the value by 1
//		System.out.println(--b); //b-- ==> pre-decrement ==> before execution of this line  decrease the value by 1
		
		
		
		
		
		//2. Assignment Operators ==> assign value to variable ==> = , +=, -=, *=, /=, %=
		
		int c = 10;
		int d = 100;
		
		c+=5; // c= c+5 
		System.out.println(c);
		
		d-=50; //d = d-50; 
		System.out.println(d);

		c*=10;//c= c*10 = 15*10 = 150
		System.out.println(c);
		
		d/=10;
		System.out.println(d);
		
		//3. Conditional Operators ==> to compare values  ==> ==, !=, > , < , >=, <=
		
		int e = 20;
		int f = 30;
		
		System.out.println(e>f);
		System.out.println(e==f);
		System.out.println(e<f);
		System.out.println(e<=f);
		
		//4. Logical Operators  ==> to build logics ==> && (and ==> all conditions should become true), || (or ==> any one condition should become true) , ! (not)
		
		
		int g = 10;
		int h = 20;
		int i = 30;
		System.out.println(g > h && h<=i ); //false and true ==> false
		
		System.out.println(g > h || h<=i ); //false or true ==> true
		
		System.out.println(!(g > h || h<=i )); //not (false or true) ==> not (true) ==> false
		
		
		//5. Ternary Operator ==>  to decide the result based on condition ==>  ?
		
		int x = 5;
		int y = 5 ;
		
		int max = (x > y ) ? x : y ;
		System.out.println(max);
		
		
		int z = 10 ;
		
		boolean isEvenNumber = (z%2 ==0)?true:false;
		System.out.println(isEvenNumber);
		
		
		//difference between = (assignment operator), == (comparison operator), equals  (it's a method to compare the content of object) in java
		
		
	}

}
