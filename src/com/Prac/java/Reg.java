package com.Prac.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg {

	public void test(int a,String str)
	{
		System.out.println("This is INT and String");
	}
	
	public void test(String str,Double a)
	{
		this.test(20,"Plabani");

		System.out.println("This is String and Double");

	}
	
	public void test(String str)
	{
		System.out.println("This is String");

	}
	
	public static void main(String[] args) {
	
		Reg ref=new Reg();
		ref.test("Plabani",12.0);
	}

}
