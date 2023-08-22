package com.Prac.java;

public class Constructor_Chain {

	Constructor_Chain()
	{
		System.out.println("Default Constructor");
	}
	Constructor_Chain(int a,String  b)
	{
		System.out.println("INT-STRING");

	}
	Constructor_Chain(String a,int b)
	{
		System.out.println("STRING-INT");

	}
	
	public static void main(String[] args)
	{
		Constructor_Chain obj=new Constructor_Chain();
	}
	
}
