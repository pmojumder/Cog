package com.Prac.java;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class Hash_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	HashSet<String> hash=new HashSet<>();
		hash.add("Plabani");
		hash.add("Plabani");
		hash.add("Java");
		hash.add("");

		int count=hash.size();
		System.out.println(count);

		for(String obj:hash)
		{
			
			System.out.println(obj);
		}*/
		
		TreeSet<String> trr=new TreeSet<>();
		trr.add("Plabani");
		trr.add("Plabani");
		trr.add("Java");
		trr.add("Executive");

		int count=trr.size();
		System.out.println(count);

		for(String obj:trr)
		{
			
			System.out.println(obj);
		}
		
	
		

	}

}
