package stringOps.dataConversions;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DataConversions {

	public static void main(String[] args) {		
		
		//Any data type to String ==> valueOf(value);
		int stdCode = 144;
		int phone = 345654;
		String StdCode = String.valueOf(stdCode);
		System.out.println(StdCode+phone);
		
		//String to number
		String balance = "Account Balance is 10000";
		balance=balance.replaceAll("[^0-9]", "");
		int Balance = Integer.parseInt(balance);
		System.out.println(Balance>=10000);
		
		//String to double 
		String pecentage = "Percentage is 98.23";
		pecentage = pecentage.replaceAll("[^0-9.]", "");
		double Percentage = Double.valueOf(pecentage);
		System.out.println(Percentage>=99.0);
		
		//Converting time stamp into String
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy:hhmmss");
		String uniqueId = sdf.format(Calendar.getInstance().getTime());
		System.out.println(uniqueId);
		
		//Type Casting ==> data converting to similar data type
		int value = 20;
		byte byteValue = (byte)value;
		
		double val = 98.99;
		int intVal = (int)val;
		System.out.println(intVal);

		double dbVal = (double)intVal;
		System.out.println(dbVal);
	}

}
