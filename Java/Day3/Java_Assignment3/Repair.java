package com.sample;
class Vehicle3{
	void drive(){
		
	}
}
class Car extends Vehicle3{
	void drive() {
		System.out.print("Repairing a car");
	}
}
public class Repair {
	public static void main(String[] args) {
		Car c = new Car();
		c.drive();
	}
}