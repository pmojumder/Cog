package com.Prac.java;

public class Single_Inheri2 extends Single_Inheri1 {
	
	public void test2()
	{
		System.out.println("This is child class");
	}

	public static void main(String args[])
	{
		Single_Inheri2 ref=new Single_Inheri2();
		ref.test2();
		ref.test();
	}
}
