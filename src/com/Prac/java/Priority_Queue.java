package com.Prac.java;

import java.util.PriorityQueue;

public class Priority_Queue {
	public static void main(String[] args) {

		PriorityQueue<String> pq=new PriorityQueue<>();
		
		pq.add("java");
		pq.add("plabani");
		pq.add("abani");
		pq.add("JAVA");
		
		int count=pq.size();
		System.out.println(count);

		for(String str:pq)
		{
			
			System.out.println(str);
		}


	}
}