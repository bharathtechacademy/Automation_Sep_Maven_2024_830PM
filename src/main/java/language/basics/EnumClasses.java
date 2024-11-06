package language.basics;

enum Directions {
	EAST, WEST,SOUTH, NORTH
}

public class EnumClasses {
	
	enum Priority {
		HIGH,MEDIUM,LOW
	}

	public static void main(String[] args) {
		System.out.println("Banglore Direction is "+Directions.SOUTH);
		System.out.println("Priority of Defect is "+Priority.LOW);

	}

}
