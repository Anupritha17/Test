package com.test;

 class A{
	void msg() {
		System.out.println("Access the default modifier from other class ");
	}
}
public class Enc {
	public static void main(String[] args) {
		Lap th=new Lap("HP", 12345, "Black");
		System.out.println(th.getColor());
		System.out.println(th.getModel());
		System.out.println(th.getNumber());
		
		
	}

}
