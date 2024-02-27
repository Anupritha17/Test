package com.temenos.inhe;

public class Mobile extends Electronics {
	private String modelName="V25"; 
	public static void main(String[] args) {
		Mobile td=new Mobile();
		td.mobile();
		System.out.println("BrandName: "+ td.brand+" "+ "Price: "+td.price );
		System.out.println("ModelName "+ td.modelName);
		
	}
	@Override
	public void mobile() {
		System.out.println("Method overriding");
		System.out.println("brand name: "+ brand);
		System.out.println("price: "+price);
		

}

}
