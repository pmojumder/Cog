package com.Prac.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Array_Verify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Create object of ArrayList
		
		ArrayList<String> li=new ArrayList<>();
		
		li.add("Apple");
		li.add("Mango");
		li.add("Mango");
		li.add("Java");
	//	li.add(20);
		li.add("");
		
	int count=	li.size();
	System.out.println(count);
	
	TreeSet<String> hash=new TreeSet<>(li);

	for(String str:hash)
	{
		System.out.println(str);
	}
	
	
/*	for(int i=0;i<count;i++)
	{
String 	 obj=	li.get(i);
System.out.println(obj);*/
	}
}


