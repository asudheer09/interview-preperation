package com.example.day1;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// How many ways to create String in java
		//1. Using literal -> String s="hello"; // String Constant Pool (SCP)
		//2. using new operator -> String s= new String("hello"); // creates object in heap memory
		
		String s1= "hello";
		String s2= new String("hello");
		
		String s3="hello";
		String s4= new String("hello");
		
		
		int a=10, b=10;
		System.out.println(a==b); //true
		
		System.out.println(s1==s2); //false
		
		System.out.println(s1.equals(s2));//true
		
		System.out.println(s1==s3); //true
		
		System.out.println(s3.equals(s4));//true
		
		System.out.println(s3==s4);//false

	}

}
