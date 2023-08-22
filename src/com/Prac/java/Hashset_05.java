package com.Prac.java;

import java.util.HashSet;
import java.util.TreeSet;

public class Hashset_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashSet<String> arr=new HashSet<>();
		TreeSet<String> arr=new TreeSet<>();
		arr.add("Plabani");
		arr.add("Plabani");
		arr.add("Yatch is  studying properly");
		arr.add("They got 0 marks in ICT exam");
	
		int count=arr.size();
		System.out.println(count);
		
		for(Object obj :arr)
		{
			System.out.println(obj);
		}
		
	}

}
