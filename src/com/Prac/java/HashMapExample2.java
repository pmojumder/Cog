package com.Prac.java;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
	
	 public static void main(String args[]){  
	   HashMap<Object,Object> map=new HashMap<Object,Object>();//Creating HashMap    
	   map.put(1,"Mango");  //Put elements in Map  
	  map.put(2,"Apple");    
	   //map.put(3,"Banana");   
	  map.put(1,"Grapes"); //trying duplicate key  
	   map.put(1,"Mango");  //Put elements in Map  */
	   map.put(5, "Lichi");
	   map.put(6,"Pack");
	   map.put(6,"Pack1");

	   

	 /* map.put(10, "MCA");
	   map.put(20, "BE");
	   map.put(20, "BDA");
	   map.put(20, "A");

	   map.put(20, "CDA");
	   map.put(30, "MB");
	   map.put(30, "MBBS");*/

       
      
	   System.out.println("Iterating Hashmap...");  
	   for(Map.Entry m : map.entrySet()){    
	    System.out.println(m.getKey()+" "+m.getValue());    
	   }  
	}  
	}  


