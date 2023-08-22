package com.Prac.java;

public class Static_Nonstatic_Example {
	Static_Nonstatic_Example()
	{
		System.out.println("Default constructor");
	}
	
	Static_Nonstatic_Example(int a)
	{

		this("Plabani");
		System.out.println("Call INT Constructor");
	}
	
	Static_Nonstatic_Example(String a)
	{
		this(20.34);
		System.out.println("Call String Constructor");
	}
	
	Static_Nonstatic_Example(double d)
	{
		System.out.println("Call double constructor");
	}

	public static void test()
	{
		System.out.println("Test Method");
		
	}
	public void test1()
	{
		System.out.println("Test1 Method");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_Nonstatic_Example.test();
		
		Static_Nonstatic_Example obj=new Static_Nonstatic_Example("Plabani");
		obj.test1();
	}

}
