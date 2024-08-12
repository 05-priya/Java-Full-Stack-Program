package com.sample;

import java.util.Scanner;

class Student{
	int registerNo;
	String studentName;
	int studentSub[]=new int[5];

Student(int registerNo, String studentName) {
	this.registerNo=registerNo;
	this.studentName=studentName;
}

void GetMarks() {
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<5;i++) {
		studentSub[i]=sc.nextInt();
	}	
}
void displayGrade() {
	int sum=0;
	int avg=0;
	for(int i=0;i<5;i++) {
		sum=sum+studentSub[i];
	}
	
	System.out.println("Student Register No : "+registerNo);
	System.out.println("Student Name : "+studentName);
	System.out.println("Student Marks: ");
	for(int i=0;i<5;i++) {
		System.out.print(studentSub[i]+" ");
	}
	System.out.println();
	System.out.println("Sum of the all Marks: "+sum);
	
	avg=sum/5;
	System.out.println("Average Marks : "+avg);
	
	if(avg>=90 && avg<=100) {
		System.out.println("Grade : O");
	}
	else if(avg>=80 && avg<90) {
		System.out.println("Grade : A");
	}
	else if(avg>=70 && avg<80) {
		System.out.println("Grade : B");
	}
	else if(avg >=60 && avg<70) {
		System.out.println("Grade : C");
	}
	else {
		System.out.println("Fail");
	}

	
}


}

public class Assignment {
	public static void main(String args[]) {
		
		Student obj =new Student(101,"Priya");
		obj.GetMarks();
		obj.displayGrade();
		
	}
	

}
