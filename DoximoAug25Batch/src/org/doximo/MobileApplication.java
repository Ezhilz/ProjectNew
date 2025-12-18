package org.doximo;

public class MobileApplication implements BusinessTemplate {
	



@Override
public void login() {
	System.out.println("Mobile login");
	
}

@Override
public void flightSearch() {
	System.out.println("Mobile flight Search");
	
}

@Override
public void signUp() {
	System.out.println("Mobile signUp");
	
}

public static void main(String[] args) {
MobileApplication m=new MobileApplication();
m.login();
m.flightSearch();
m.signUp();
}
}
