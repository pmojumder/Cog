package com.second.java;

public class Prac {
	Prac(){
		System.out.println("Constructor created");
		
	}
	
	/*Prac(int a,int b)
	{
		this();
		System.out.println("Display Int value");
	}
	
	Prac(String a,int b)
	{
		this(10,20);
		System.out.println("Display String value");
	}*/
	//-------------------------------------//
	//nonstatic-hence creating object for class  
	int a=10;
	//Static method,directly can call the method without creating object
	public static void test()
	{
		System.out.println("Test Method");
	}

	public static void main(String[] args) {
	
		Prac ref=new Prac();
		
				System.out.println(ref.a);
		
		Prac.test();
	}
/*public static void main(String[] args)
{

String str="Plabani";
int len=str.length();
char ch[]=str.toCharArray();

for(int i=0;i<len-4;i++)
{
System.out.println(ch[i]);
}
}*/

}
