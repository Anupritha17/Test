package com.collection;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
//Dynamic array store and access the data
public class ArrList {
	public static void main(String[] args) {
		int a[]=new int[5];//fixed size
		
		ArrayList<Integer> Ilist=new ArrayList <Integer>();
		for(int i=0; i<=10; i++) 
		Ilist.add(i);
		Ilist.add(100);
		System.out.println(Ilist);
		System.out.println(Ilist.get(5));
		Ilist.set(1, 100);
		Ilist.remove(5);
		System.out.println(Ilist);
		
		ArrayList<String> list = new ArrayList <String>();
		list.add("ANU");// Adding object
		list.add("PRITHA");
		list.add("JOHN");
		list.add("MARTIN");
	
		System.out.println(list);
		for(Object obj:list)
			System.out.println(obj);
		Iterator<String> it = list.iterator();//Iterator object
		while (it.hasNext()) {
			System.out.println(it.next());

		}

	}

}
