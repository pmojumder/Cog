package com.Prac.java;

public class Method_Over1 {

	public void test(int a,String b)
	{
		System.out.println("Int String");
	}
	public void test(String b)
	{
		this.test(20,"Plabani");
		System.out.println("String");

	}
	public void test(String c,int b)
	{
		System.out.println("Int");

	}
	
	public static void main(String[] args)
	{
		Method_Over1 ref=new Method_Over1();
		ref.test("Plabani");
	}
	
}
