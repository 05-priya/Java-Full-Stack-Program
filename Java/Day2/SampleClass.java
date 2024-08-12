package com.sample;

class Employee{
	int employeeId;
	String employeeName;
	float employeeSalary;
	
	//constructor
	Employee(int employeeId,String employeeName, float employeeSalary){
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employeeSalary=employeeSalary;
	}
	
	//method
	void display() {
		System.out.println("Employee Id : "+employeeId);
		System.out.println("Employee Name : "+employeeName);
		System.out.println("Employee Salary : "+employeeSalary);
	}
}
public class SampleClass {
	
	public static void main(String[] args) {
		Employee emp1 = new Employee(101,"Priya",30000);
		emp1.display();
		
		System.out.println();
		
		Employee emp2 = new Employee(102,"Dhee",40000);
		emp2.display();

	}

}
