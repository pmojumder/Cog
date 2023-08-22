package com.Prac.java;
public class Method_Overloading {
	Method_Overloading(int a)
	{
		this("Plabani");
		System.out.println("Constructor-INT");
	}
	Method_Overloading(String a)
	{
		System.out.println("Constructor-STRING");
	
	}
	public void test(int a)
	{
		this.test("Plabani");
		System.out.println(" INT ");

	}
	public void test(String a)
	{
		System.out.println(" STRING ");

		
	}
	public void test(String a,int b)
	{
		System.out.println(" STRING INT");
	}
	public void test(int a ,String b)
	{
		this.test(10);
		System.out.println("INT STRING");
	}

public static void main(String[] args)
{
	Method_Overloading ref=new Method_Overloading(10);
	ref.test(10,"Plabani");
}

}
