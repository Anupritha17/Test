package com.temenos.inhe;
interface test {
	public void firstmethod();
	public void secondMethod();
	
}
public class Interf implements test {
	public void firstmethod() {
		System.out.println("first method test");
	}
	public void secondMethod() {
		System.out.println("Second methos class test");
	}
public static void main(String[] args) {
	Interf obj=new Interf();
	obj.firstmethod();
	obj.secondMethod();
	
}
}
