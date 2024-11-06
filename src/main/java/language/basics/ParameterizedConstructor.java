package language.basics;

public class ParameterizedConstructor {
	
	int empId = 0;
	
	ParameterizedConstructor(int id){
		empId = id;
	}

	public static void main(String[] args) {
		ParameterizedConstructor obj = new ParameterizedConstructor(1234);
		
		obj.printEmpPersonalData( "Bharath");
		obj.printEmpProfessionalData( 13);
		obj.printEmpRole("SeniorEngineer");
	}

//	void printEmpPersonalData(int empId, String empName) {
//		System.out.println(empId);
//		System.out.println(empName);
//	}
//
//	void printEmpProfessionalData(int empId, int totalExperience) {
//		System.out.println(empId);
//		System.out.println(totalExperience);
//	}
//
//	void printEmpRole(int empId,String role) {
//		System.out.println(empId);
//		System.out.println(role);
//	}
	
	void printEmpPersonalData(String empName) {
		System.out.println(empId);
		System.out.println(empName);
	}

	void printEmpProfessionalData(int totalExperience) {
		System.out.println(empId);
		System.out.println(totalExperience);
	}

	void printEmpRole(String role) {
		System.out.println(empId);
		System.out.println(role);
	}

}
