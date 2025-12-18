package org.test;

public class SampleNew extends Hello {
	//default or non parameterized constructor
	public SampleNew() {
		super(600);
		System.out.println("default constructor");
	}
	
	//parameterized constructor
	public SampleNew(int id) {
		super(700);
		System.out.println("int para constructor");
		System.out.println(id);
	}

	public static void main(String[] args){
		SampleNew s=new SampleNew(300);
	
		
	}

}
