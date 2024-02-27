package com.day.three;

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		String str=src.next();
		char [] newstr=str.toCharArray();
		int count;
	for(int i=0; i<newstr.length; i++) {
		count=1;
	for(int j=i+1; j<newstr.length; j++) {
		if(newstr[i]==newstr[j] ){
			count++;
		}
	}
	if(count>1 ){
		System.out.println(newstr[i]);
	}
	}
	}
	}
//		String str="java";
//		int count;
//		char str2[]= str.toCharArray();
//		for(int i=0;i<str2.length; i++) {
//			count=1;
//			for(int j=i+1;j<str2.length;j++) {
//				if(str2[i]==str2[j]) {
//					count++;
//					//replace the repeated letter as 0 to stop printing in console
//					str2[j]=0;
//				}
//			}
//			if(count>1 && str2[i]!=0) {
//				System.out.println(str2[i]);
//			}
//		}
//	}
//}
