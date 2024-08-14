package com.sample;

class Vehicle1{
	
	void noOfEngine() {
		System.out.println("I hava one engine");
	}
}

class TwoWheeler2 extends Vehicle1 {
	
	void noOfWheels() {
		System.out.println("I hava two Wheels");
		
	}
}

class Bike2 extends TwoWheeler2{
	
	void brandName() {
		System.out.println("Brand Name is Honda");
	}
}

class Scooty extends TwoWheeler2{
	
	void brandName() {
		System.out.println("Brand Name is Activa");
	}
}

public class HierarchicalInheritance {
	public static void main(String[] args) {
		
		Bike2 bike = new Bike2();
		bike.noOfEngine();
		bike.noOfWheels();
		bike.brandName();
	    
		Scooty scooty = new Scooty() ;
		scooty.noOfEngine();
		scooty.noOfWheels();
		scooty.brandName();
		
		
	}

}
