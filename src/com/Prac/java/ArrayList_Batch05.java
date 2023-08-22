package com.Prac.java;

import java.util.ArrayList;
import java.util.TreeSet;

public class ArrayList_Batch05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arr=new ArrayList<>();
		arr.add("Plabani");
		arr.add("Bac is not studying properly");
		arr.add("Btech got 0 marks in ICT exam");
		arr.add("Plabani");

		int count=arr.size();
		System.out.println(count);
	
		TreeSet<String> tree=new TreeSet<>(arr);
		for(String str :tree)
		{
			System.out.println(str);
		}
		

	}

}
