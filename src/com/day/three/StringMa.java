package com.day.three;
public class StringMa {
	public static void main(String[] args) {
		String str="String example of example";
		String str2="String example2";
		String str3="String example3";
		String str4="String example3";
		System.out.println(str3.startsWith("S"));
		System.out.println("Comparing "+str +" and "+str2 +": "+ str.equals(str2));
		System.out.println("Comparing "+str3+ " and "+ str4 +": "+ str3.equals(str4));
		String input="Simple";
		StringBuilder input1=new StringBuilder("NEW");
		input1.append(input);
		input1.insert(6, "!");
		input1=input1.reverse();
		String result=input1.toString();
		System.out.println(result);
		//Upper and lower
		String input2="Annu";
		System.out.println(input2.toUpperCase());
		System.out.println(input2.toLowerCase());
		//Substring
		String stri="    ANU PRITHAJOHN MARTIN    ";
		String substr=stri.substring(4,14);
		String substri=stri.trim();
		System.out.println(substr);
		System.out.println(substri);
	}
	

}
