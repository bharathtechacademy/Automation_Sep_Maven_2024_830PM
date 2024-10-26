package assignments;

import java.util.*;

public class CollectionsSolution {
    public static void main(String[] args) {
        // Create individual student data using HashMap
        Map<String, String> student1 = new HashMap<String, String>();
        student1.put("Name", "John Doe");
        student1.put("Age", "20");
        student1.put("Gender", "Male");
        student1.put("Roll Number", "S12345");
        student1.put("Grade", "A");
        student1.put("Major", "Computer Science");
        student1.put("GPA", "3.8");
        student1.put("Email", "john@example.com");
        student1.put("Contact Number", "9876543210");
        student1.put("Address", "123 Elm St");

        Map<String, String> student2 = new HashMap<String, String>();
        student2.put("Name", "Jane Smith");
        student2.put("Age", "21");
        student2.put("Gender", "Female");
        student2.put("Roll Number", "S12346");
        student2.put("Grade", "B");
        student2.put("Major", "Mathematics");
        student2.put("GPA", "3.5");
        student2.put("Email", "jane@example.com");
        student2.put("Contact Number", "9876543211");
        student2.put("Address", "456 Oak St");

        Map<String, String> student3 = new HashMap<String, String>();
        student3.put("Name", "Mike Brown");
        student3.put("Age", "22");
        student3.put("Gender", "Male");
        student3.put("Roll Number", "S12347");
        student3.put("Grade", "A");
        student3.put("Major", "Physics");
        student3.put("GPA", "3.9");
        student3.put("Email", "mike@example.com");
        student3.put("Contact Number", "9876543212");
        student3.put("Address", "789 Pine St");

        // Add all student maps to a list
        List<Map<String, String>> studentList = new ArrayList<Map<String, String>>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        // Create individual employee data using HashMap
        Map<String, String> employee1 = new HashMap<String, String>();
        employee1.put("Employee ID", "E001");
        employee1.put("Name", "Alice Green");
        employee1.put("Age", "30");
        employee1.put("Gender", "Female");
        employee1.put("Department", "Engineering");
        employee1.put("Position", "Software Engineer");
        employee1.put("Salary", "75,000");
        employee1.put("Email", "alice@example.com");
        employee1.put("Contact Number", "9876543213");

        Map<String, String> employee2 = new HashMap<String, String>();
        employee2.put("Employee ID", "E002");
        employee2.put("Name", "Bob Johnson");
        employee2.put("Age", "35");
        employee2.put("Gender", "Male");
        employee2.put("Department", "Marketing");
        employee2.put("Position", "Marketing Manager");
        employee2.put("Salary", "85,000");
        employee2.put("Email", "bob@example.com");
        employee2.put("Contact Number", "9876543214");

        Map<String, String> employee3 = new HashMap<String, String>();
        employee3.put("Employee ID", "E003");
        employee3.put("Name", "Carol White");
        employee3.put("Age", "28");
        employee3.put("Gender", "Female");
        employee3.put("Department", "Sales");
        employee3.put("Position", "Sales Executive");
        employee3.put("Salary", "65,000");
        employee3.put("Email", "carol@example.com");
        employee3.put("Contact Number", "9876543215");

        // Add all employee maps to a list
        List<Map<String, String>> employeeList = new ArrayList<Map<String, String>>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        
        // Create individual product data using HashMap
        Map<String, String> product1 = new HashMap<String, String>();
        product1.put("Product ID", "P001");
        product1.put("Name", "Laptop");
        product1.put("Category", "Electronics");
        product1.put("Price", "$1,200");
        product1.put("Stock Quantity", "50");
        product1.put("Supplier", "Tech Supplies");
        product1.put("Warranty", "2 years");
        product1.put("Rating", "4.5");
        product1.put("Manufacturing Date", "15-01-2023");
        product1.put("Expiry Date", "15-01-2025");

        Map<String, String> product2 = new HashMap<String, String>();
        product2.put("Product ID", "P002");
        product2.put("Name", "Desk Chair");
        product2.put("Category", "Furniture");
        product2.put("Price", "$150");
        product2.put("Stock Quantity", "200");
        product2.put("Supplier", "Office Depot");
        product2.put("Warranty", "1 year");
        product2.put("Rating", "4");
        product2.put("Manufacturing Date", "10-02-2023");
        product2.put("Expiry Date", "N/A");

        Map<String, String> product3 = new HashMap<String, String>();
        product3.put("Product ID", "P003");
        product3.put("Name", "Coffee Maker");
        product3.put("Category", "Kitchen");
        product3.put("Price", "$75");
        product3.put("Stock Quantity", "100");
        product3.put("Supplier", "KitchenWorld");
        product3.put("Warranty", "6 months");
        product3.put("Rating", "4.2");
        product3.put("Manufacturing Date", "20-03-2023");
        product3.put("Expiry Date", "20-03-2024");

        // Add all product maps to a list
        List<Map<String, String>> productList = new ArrayList<Map<String, String>>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        
        Map<String, List<Map<String, String>>> data = new HashMap<String, List<Map<String, String>>>();
        data.put("StudentData", studentList);
        data.put("EmployeeData", employeeList);
        data.put("ProductData", productList);
        
        //Output
       System.out.println(data.get("ProductData").get(1).get("Supplier"));
    }
}
