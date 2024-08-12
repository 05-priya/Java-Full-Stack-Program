package com.sample;

public class Rectangle {
	
	int width;
	int height;
	int area;
	int perimeter;

	Rectangle(int width, int height){
		this.width=width;
		this.height=height;
	}
	
	void calculate() {	
		area=width*height;
		perimeter=2*(width+height);
	}
	
	void display() {
		System.out.println("Area of Rectangle: "+area);
		System.out.println("Perimeter of Rectangle: "+perimeter);
			
	}
	public static void main(String[] args) {
		Rectangle obj = new Rectangle(10,20);
		obj.calculate();
		obj.display();
	}
}
