package com.second.java;

public class CharLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String name="Plabani";  
			char ch[]=name.toCharArray();
			
		 int len=name.length()/2;
		 System.out.println(ch[len]);
		 System.out.println("---------------");
		 for(int i=len;i>=0;i--)
		 {
			 System.out.println(ch[i]);
		 }
			}


	}


