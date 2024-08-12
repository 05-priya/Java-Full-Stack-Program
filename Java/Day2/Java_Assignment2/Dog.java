package com.sample;

public class Dog {
	
	String name;
	String breed;
	
	Dog(String name, String breed){
		this.name=name;
		this.breed=breed;		
	}
	
	void setter(String name, String breed) {
		this.name=name;
		this.breed=breed;
	}

	void display() {
		System.out.println("Name : "+name);
		System.out.println("Breed : "+breed);
		
	}
	public static void main(String[] args) {
		Dog obj = new Dog("Tommy","Labrador");
		obj.setter("Alex","Pomeranian");
		obj.display();
		System.out.println();
		Dog obj1 = new Dog("Tommy","Labrador");
		obj1.setter("Charlie","Pug");
		obj1.display();
		
	}

}
