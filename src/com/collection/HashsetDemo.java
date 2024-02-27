package com.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetDemo {
	public static void main(String[] args) {
		Set<String> S1=new HashSet<String>();
		S1.add("SPIDE");
		S1.add("SPIDE");
		S1.add("JK");
		S1.add("GETORDER");
		S1.add("JK");
		Iterator<String> I1=S1.iterator();
		while(I1.hasNext()) {
			System.out.println("NO DUPLICATES: "+I1.next());
		}
		Set<String> S2=new HashSet<String>();
		S2.add("NEW");
		S2.add("UPDATED LIST");
		S2.remove("NEW");
		S1.addAll(S2);
		System.out.println("After adding the new set "+ S1 );
	}

}
