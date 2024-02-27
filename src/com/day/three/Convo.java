package com.day.three;

public class Convo {
   String name;
   int age;
   Convo(){
	   System.out.println("dafault");
   }
   Convo(String name,int age){
	   this.name=name;
	   this.age=age;
   }

   public static void main(String[] args) {
	   Convo type=new Convo();
		System.out.println(type.name+type.age);   
	   

   Convo type2=new Convo("ANNU",12);
 System.out.println("age:"+ type2.age+ "name :" + type2.name);
   
   }
}