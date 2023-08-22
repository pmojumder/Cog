package com.Prac.java;

import java.io.FileNotFoundException;


public class Exception {

	public static void main(String[] args) {
		

	try
		{
			int n;
			n=12/0;
			System.out.println(n);
					
		}
	  catch(ArithmeticException E)
		{
			System.out.println("Number divided by 0 cannot be executed");
		}
		finally
		{
			System.out.println("Finally block should execute irrespective of try and catch block working or not");
		}
	}

	

}
