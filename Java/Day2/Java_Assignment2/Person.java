package com.sample;

public class Person {
	
	String name;
	int age;
	
	Person(String name, int age){
		this.name=name;
		this.age=age;		
	}
	void display() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		
	}
	public static void main(String[] args) {
		Person obj = new Person("Priya",21);
		obj.display();
		System.out.println();
		Person obj1 = new Person("Dhee",20);
		obj1.display();
	}

}
