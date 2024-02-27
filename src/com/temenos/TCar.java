package com.temenos;

public class TCar {
	private String name;
	private int price;
	private String type;
//	public TCar(String name, int price, String type) {
//		name=name;
//		price=price;
//		type=type;
//		
//	}
	public TCar(String name,int price,String type) {
		this.name=name;
		this.price=price;
		this.type=type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	

}
