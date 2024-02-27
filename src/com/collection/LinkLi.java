package com.collection;

import java.util.Iterator;
import java.util.LinkedList;
//Double linked list to manipulate the data
public class LinkLi {
	public static void main(String[] args) {
		LinkedList <String> li=new LinkedList<String>();
		li.add("ANU");
		li.add("PRITHA");
		li.add("JOHN");
		li.add("MARTIN");
			System.out.println(li);
			li.add(1,"JAP");
			System.out.println(li);
			LinkedList <String> lii=new LinkedList<String>();
			lii.add("SADR");
			lii.add("KSAHN");
			li.addAll(lii);
			li.addFirst("FIRST");
			li.addFirst("LAST");
			System.out.println(li);
			
			
			
	}

}
