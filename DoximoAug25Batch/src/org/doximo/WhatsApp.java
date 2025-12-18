package org.doximo;
//class name
public class WhatsApp {
	
	//method
	private void login() {		
System.out.println("please create a account");
	}
	
	private void userName() {
	System.out.println("Please enter the username");

	}
	
	private void passWord() {
	System.out.println("Enter the Password");

	}
	

	public static void main(String[] args) {
		WhatsApp w=new WhatsApp();
		w.login();
		w.userName();
		w.passWord();
	}

}
