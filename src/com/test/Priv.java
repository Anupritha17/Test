package com.test;

import com.temenos.inhe.*;

class Sample {
private int x=50;
private void test() {
	System.out.println("Inside private");
}
}
public class Priv extends Protect {
	public static void main(String[] args) {
		Sample AB=new Sample();
		//System.out.println(AB.x);
		//AB.test
		A ABC=new A();
		ABC.msg();
		Priv PP=new Priv();
		PP.msgg();
		Mobile phone=new Mobile();
		phone.mobile();
	}
}

