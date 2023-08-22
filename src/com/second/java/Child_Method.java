package com.second.java;

public class Child_Method extends Parent_Method{

	public void test(String a)
	{
		super.test(20);
	System.out.println("This is String Test");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child_Method ref=new Child_Method();
		ref.test("Plabani");
	}

}
