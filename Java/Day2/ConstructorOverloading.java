package com.sample;

public class ConstructorOverloading {
	
	//Constructor overloading
		
	ConstructorOverloading(String name) {
			System.out.println("Welcome "+name);
		}
		
	ConstructorOverloading(int a,int b) {
		this("Dhee");
			System.out.println("Addition : "+(a+b));
			
		}
		
	ConstructorOverloading(int n) {
		this(10,20);
			int fact =1;
			for(int i=1;i<=n;i++) {
				fact=fact*i;
			}
			System.out.println("Factorial : "+fact);
			
			
		}
			public static void main(String[] args) {
				ConstructorOverloading obj1 = new ConstructorOverloading(6);
				//ConstructorOverloading obj2 = new ConstructorOverloading("Priya");
				//ConstructorOverloading obj3 = new ConstructorOverloading(20,30);			
			
		}

}
