package com.collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap <String,String> countries=new HashMap <String,String>();
		countries.put("INDIA","DELHI");
		countries.put("USA", "WASHINGTON DC");
		countries.put("CANADA","OTTAWA");
		countries.put("AUSTRALIA","CANBERRA");
		System.out.println(countries);
		countries.remove("USA");
		System.out.println(countries);
		System.out.println(countries.get("AUSTRALIA"));
		System.out.println(countries.size());
		countries.replace("USA", "DC");
		System.out.println(countries.containsKey("USA"));
		System.out.println(countries.containsValue("CANBERRA"));
		Iterator<Entry<String, String>> I1=countries.entrySet().iterator();
		while(I1.hasNext()) {
			System.out.println(I1.next());
		}
		
		
	}

}
