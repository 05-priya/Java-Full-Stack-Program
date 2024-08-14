package com.sample;

class A1{
	A1(){
		super();
		System.out.println("A");
	}
	A1(int a){
		this();
		System.out.println("A1");
	}
}

class B1 extends A1{
	 B1(){
		super(5);
		System.out.println("B");
	}
}

public class SuperKeyword1 {
	static public void main(String[] args) {
		B1 b = new B1();
	}
}
