package org.doximo;

//child 1 class
public class ClientDetails  {
	public void cliId() {
	System.out.println("Client id is 3678");
}
	public void cliName() {
		System.out.println("Client Name is Dinesh");
	}
	
	public static void main(String[] args) {
		ClientDetails d=new ClientDetails();
		d.cliId();
		d.cliName();
		
	}
}
