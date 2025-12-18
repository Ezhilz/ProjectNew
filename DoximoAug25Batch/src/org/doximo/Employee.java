package org.doximo;

public class Employee {
	
	public void empDetails(String name) {
		System.out.println("String method "+name);

	}
	//dataType count
	public void empDetails(String name,long phone,char block) {
		System.out.println("String long char method "+name);
		System.out.println(phone);
		System.out.println(block);

	}
	//dataType
	public void empDetails(int age) {
		System.out.println("int method "+age);

	}
	
	public void empDetails(boolean status) {
		System.out.println("boolean method "+status);

	}
	
	//dataType Order
	public void empDetails(String email,float sal) {
		System.out.println("string float method "+email);
		System.out.println(sal);
	}
	public void empDetails(float sal,String email) {
		System.out.println("float string method "+sal);
		System.out.println(email);
	}
	public static void main(String[] args) {
		Employee e=new Employee();
		e.empDetails("Arun");
		e.empDetails("Dinesh",9876543210l,'A');
		e.empDetails(25);
		e.empDetails(true);
		e.empDetails("Nisha",5677.5f);
		e.empDetails(7876.5f, "siva");

	}

}
