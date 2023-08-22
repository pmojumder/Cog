package com.Prac.java;

public class ClassA {

		// TODO Auto-generated method stub
ClassA()
{
	System.out.println("Default");
}
ClassA(int a,int b)
{
	this(10,"Plabani");
System.out.println("INT constructor");
}

ClassA(int a,String b)
{
	this();
	
System.out.println("String constructor");
}
int a=10;
public void test()
{

	System.out.println("test");
}
public static void main(String[] args) {

ClassA ref=new ClassA(10,20);
ref.test();
System.out.println(ref.a);

}

}

	


