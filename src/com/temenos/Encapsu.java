package com.temenos;

public class Encapsu {
	public static void main(String[] args) {
		TCar ts=new TCar("VENUE",1200000,"SUV");
		System.out.println(" NAME :" +ts.getName()+","+" PRICE :" +ts.getPrice()+","+" TYPE :"+ts.getType());
		System.out.println("    After new changes   ");
		ts.setPrice(1300000);
		System.out.println(" NAME: "+ ts.getName()+","+ " PRICE :"+ ts.getPrice()+","+" TYPE : "+ts.getType());
	}

}
