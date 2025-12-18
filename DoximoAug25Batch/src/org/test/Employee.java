package org.test;

public class Employee {
	private int id;
	private String name;
	private long phone;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setId(100);
		System.out.println(e.getId());
		e.setName("Arun");
		System.out.println(e.getName());
		e.setPhone(9876543210l);
		System.out.println(e.getPhone()); 
	}

}
