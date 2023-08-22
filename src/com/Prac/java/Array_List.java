package com.Prac.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Array_List {

	public static void main(String[] args) {

		/*// TODO Auto-generated method stub
//ArrayList<Object> arr=new ArrayList<>();
ArrayList<Object> arr=new ArrayList<>();

arr.add("Java");
arr.add("Plabani");
arr.add("Training");
arr.add(20);
arr.add("Training");

int count=arr.size();
System.out.println(count);
//arr.add(20);
//arr.add(20.5);

for(Object obj:arr)
System.out.println(obj);



*/

//-----------------------
HashSet<String> hash=new HashSet<>();
//TreeSet<String> tree=new TreeSet<>();
//No Duplicate,and helps to do auto sorting
hash.add("Plabani");
hash.add("Plabani");
hash.add("Mojumder");
hash.add("Zacob");

int count1=hash.size();
System.out.println(count1);

for( String str:hash)
{
	System.out.println(str);

}
/*for(int i=0;i<count;i++)
{
	//Object obj=arr.get(i);
	String str=arr.get(i);
	System.out.println(str);
}*/
	}

}
