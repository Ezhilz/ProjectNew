package org.doximo;

public class DoximoBank extends ICICIBank {
	
	public void deposit() {
		super.deposit();
		System.out.println("3%");
	}

	public static void main(String[] args) {
		DoximoBank d=new DoximoBank();
		d.saving();
		d.deposit();

	}

}
