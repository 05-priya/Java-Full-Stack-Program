package com.sample;


class Vehicle{
	
	void noOfEngine() {
		System.out.println("I hava one engine");
	}
}

class TwoWheeler1 extends Vehicle {
	
	void noOfWheels() {
		System.out.println("I hava two Wheels");
		
	}
}

class Bike1 extends TwoWheeler1{
	
	void brandName() {
		System.out.println("Brand Name is Honda");
	}
}

public class MultilevelInheritance {
	public static void main(String[] args) {
	Bike1 bike = new Bike1();
	bike.noOfEngine();
	bike.noOfWheels();
	bike.brandName();
	}

}
