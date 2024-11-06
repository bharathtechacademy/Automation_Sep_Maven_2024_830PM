package functionalInterfacesPack;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class DefaultFunctionalInterfaces3 {

	public static void main(String[] args) {
//		DefaultFunctionalInterfaces3 obj = new DefaultFunctionalInterfaces3();
//		System.out.println(obj.getDateAndTime());
		
		Supplier<LocalDateTime> date = () -> LocalDateTime.now();
		System.out.println(date.get());		
	}
	
//	public LocalDateTime getDateAndTime() {
//		LocalDateTime date = LocalDateTime.now();
//		return date;		
//	}

}
