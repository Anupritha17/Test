package com.test;

public class Lap {
	private String model;
	private int number;
	private String color;
	public Lap(String model, int number, String color) {
		this.color=color;
		this.model=model;
		this.number=number;
		
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

}
