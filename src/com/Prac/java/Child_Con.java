package com.Prac.java;

public class Child_Con extends Parent_con {
	Child_Con()
	{
		System.out.println("Constructor default");
	}
	
	Child_Con(int a)
	{
		super("Plabani",10);
		System.out.println("Constructor INT");
	}

}
