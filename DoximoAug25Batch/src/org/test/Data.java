package org.test;

public class Data {

	public static void main(String[] args) {
	
		int a[]=new int [5];
		a[0]=10;
		a[1]=50;
		a[2]=90;		
		a[4]=70;
		
		
		System.out.println("Iterate using enhanced for loop");
		
		for(int x:a){
			System.out.println(x); 
		}
		
	}	
}
