package com.test;

class Supeeg {
	String color="Red";
}
	 class sub extends Supeeg{
		String color="Black";
		void printcolor() {
			System.out.println(color);
			System.out.println(super.color);
		}
	}

public class Subone{
	public static void main(String[] args) {
		sub d=new sub();
		d.printcolor();
	}
}

