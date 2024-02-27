package com.temenos;
interface Parent1{
	 void same1();
}
interface Parent2{
	void same2();
}

public class MultiIn implements Parent1,Parent2 {
	
	public static void main(String[] args) {
		MultiIn test=new MultiIn();
		test.same1();
		test.same2();
	}

	@Override
	public void same2() {
		// TODO Auto-generated method stub
		System.out.println("method one");
		
	}

	@Override
	public void same1() {
		// TODO Auto-generated method stub
		System.out.println("method two");
		
	}
}