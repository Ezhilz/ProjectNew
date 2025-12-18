package org.doximo;
//child 2 class
public class CompanyDetails extends EmployeeDetails{
	public void cmpId() {
	System.out.println("company id is 4667");
}
	public void cmpName() {
	System.out.println("Company name is doximo");
	}
	
	public static void main(String[] args) {
		CompanyDetails c=new CompanyDetails();
		c.cmpId();
		c.cmpName();
		c.empId();
		c.empName();
		

	}

}
