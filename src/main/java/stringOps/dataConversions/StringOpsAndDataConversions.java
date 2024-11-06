package stringOps.dataConversions;

public class StringOpsAndDataConversions {
	
	// Username : Admin | Password : admin123 

	public static void main(String[] args) {
		
		//Storing String value
		String value = " Username : Admin | Password : admin123 ";
		
		//Get total chars available with in the String ==> length()
		int totalChars = value.length();
		System.out.println("Total Chars : "+totalChars);
		
		//Get the specific chars from specific index ==> charAt(Index);
		System.out.println("Char at 5th Index : "+value.charAt(5));
		
		//Reverse the String
		String reverseValue = "";
		for(int i=value.length()-1 ;i >=0 ; i--) {
			reverseValue = reverseValue+value.charAt(i);
		}
		System.out.println("Reverse Value is :"+ reverseValue);

		//Remove unwanted spaces from the String ==> trim()
		System.out.println(value);
		System.out.println(value.trim());
		
		//Remove/Replace specific char/chars from the String ==> replace(oldChars, newChars);
		System.out.println(value);
		System.out.println(value.replace(" ", ""));
		
		//Remove all alphabets /all numbers /all special chars from String ==> replaceAll(regExp,newChars);
		System.out.println(value.replaceAll("[a-zA-Z]", ""));
		System.out.println(value.replaceAll("[0-9]", ""));
		System.out.println(value.replaceAll("[^a-zA-Z0-9]", ""));
		
		//Change the case of chars from String ==> toUpperCase(), toLowerCase()
		System.out.println(value);
		System.out.println(value.toLowerCase());
		System.out.println(value.toUpperCase());
		
		//Get/Extract Specific Part of the String ==> subString(startIndex,endIndex+1) , subString(startIndex)
		System.out.println(value.substring(12,17));
		System.out.println(value.substring(31));
		
		//Get/Extract Specific Part of the dynamic String with similar pattern ==> split(regExp);
		String [] splittedValues = value.split(" ");
		System.out.println(splittedValues[3]);
		System.out.println(splittedValues[7]);
		
		//Reverse the sentence
		String original = "Ravi Sankar Jadav";
		String [] split = original.split(" ");
		String revName = "";
		for(int i=split.length-1; i>=0 ;i--) {
			revName = revName+split[i]+" ";
		}
		System.out.println(revName);
		
		//Compare the Strings ==> equals, equalsIgnoreCase, contains
		//=,==,equals,equalsIgnoreCase
		
		String value1="Bharath";
		String value2="bharath";
		String value3="Bharath";
		String value4="hara";
		String value5="Hara";
		
		System.out.println(value1.contains(value5));
		
		//String ==> immutable class
		//StringBuffer ==> mutable classes ==>synchronized
		//StringBuilder ==> mutable classes ==> non-synchronized 
		
		//immutable
		String name = new String ("Pricilla");
		name.concat(" Reddy");
		System.out.println(name);
		
		
		//mutable
		StringBuffer name1 = new StringBuffer("Prathap");
		name1.append(" Reddy");
		System.out.println(name1);
		
		StringBuilder name2 = new StringBuilder("Prathap");
		name2.append(" Reddy");
		System.out.println(name2);
		
		System.out.println("Hi@raviJadhav@123456".replaceAll("[^a-zA-Z]", ""));
		
		//Data Conversions
		
		
	}

}
