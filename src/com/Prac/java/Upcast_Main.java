package com.Prac.java;

public class Upcast_Main {

	public static void main(String[] args) {

		Upcast_Super ref=new Upcast_Sub();//Upcasting
		ref.test();
 ref.test1();
 ref.test();
 
 //Upcast_Sub ref1=(Upcast_Sub)ref;

 
 /*Upcast_Sub ref1=(Upcast_Sub)ref;//Downcasting
 ref1.test3();
 ref1.test();
 ref1.test();*/
	}

}

///Converting subclass object to Superclass object.Using Upcasting we can directly call method from Super class.
//Converting upcasted ref variable to subclass object,is called as Downcasting