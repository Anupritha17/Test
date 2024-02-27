package com.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashIno {
	public static void main(String[] args) {
		ArrayList<String> A1 = new ArrayList<String>();
		A1.add("ANU");
		A1.add("PRITHA");
		A1.add("JOHN");
		HashSet<String> H1 = new HashSet<String>(A1);
		H1.add("MARTIN");

		Iterator<String> I1 = H1.iterator();
		while (I1.hasNext()) {
			System.out.println(I1.next());
		}
	}

}
