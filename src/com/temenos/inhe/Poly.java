package com.temenos.inhe;
//same method, but different arguments/parameter or return type
public class Poly {
	 static int add(int a, int b) {
		return a + b;
	}

	 static double add(double a, double b, double c) {
		return a + b+ c;
	}



	public static void main(String[] args) {
		System.out.println(Poly.add(11, 11));
		System.out.println(Poly.add(12.3, 12.6, 12.7));
	}

	
}