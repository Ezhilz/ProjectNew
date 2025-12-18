package org.test;

public class Hello {	
	public Hello(){
		System.out.println("Parent default constructor");
	}
	
	public Hello(int id){
		System.out.println("Parent in para constructor");
		System.out.println(id);
	}
}
