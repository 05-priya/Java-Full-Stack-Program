package com.sample;
class Shape{
	void getArea() {
		System.out.println("Area of the shape.");;
	}
}

class Rectangle1{
	int l,b;
	Rectangle1(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	void getArea() {
		System.out.println("Area of the Rectangle  : "+(l*b));
	}
}
public class Shapes {
	public static void main(String args[]) {
		Rectangle1 rectangle = new Rectangle1(10,15);
		rectangle.getArea();
	}
}