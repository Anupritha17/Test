package com.day.three;

public class ConOverload {
	String name;
	int id;
	
	ConOverload(){
    System.out.println("Default values can print here ");
	}
	ConOverload(String n,int i){
		this.name=n;
		this.id=i;
	}
	
		public  static void main(String[] args) {
			ConOverload conv=new ConOverload();
			System.out.println("NAME :"+conv.name+" id: "+conv.id);
			
			ConOverload con=new ConOverload("LYAN", 20101);
			System.out.println("Parameterized Constructor value");
			System.out.println("NAME: "+con.name+" id: "+con.id);
		}
	
	

}
