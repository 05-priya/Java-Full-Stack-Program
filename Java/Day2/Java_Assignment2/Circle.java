package com.sample;

public class Circle {
	
	double radius;
	double area;
	double circumference;

	Circle(double radius){
		this.radius=radius;
	}

	void Calculate() {
	double pi=3.14;
		 area=pi*radius*radius;
		 circumference=2*pi*radius;
	}
	
	void display() {
		System.out.println("Area of circle: "+area);
		System.out.println("circumference of Circle: "+circumference);
			
	}
	public static void main(String[] args) {
		Circle obj = new Circle(5);
		obj.Calculate();
		obj.display();
	}

}
