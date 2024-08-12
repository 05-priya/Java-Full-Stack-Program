package com.sample;

public class Employees {
	
 String name;
 String jobTitle;
 float salary;
 
 Employees(String name, String jobTitle, float salary){
	 this.name=name;
	 this.jobTitle=jobTitle;
	 this.salary=salary;
	 
 }
 
 void calculate(int amount) {
	 salary+=amount;
 }
 void display() {
	 System.out.println("Name : "+name);
	 System.out.println("JobTitle : "+jobTitle);
	 System.out.println("Salary : "+salary);
 }
 
 public static void main(String[] args) {
	 Employees obj = new Employees("Priya","CEO",80000);
	 obj.calculate(20000);
	 obj.display();
 }
 
}
