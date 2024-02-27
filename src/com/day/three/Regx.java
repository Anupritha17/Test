package com.day.three;

import java.util.HashMap;
import java.util.Map;

public class Regx {
public static void main(String[] args) {
//	String statement="THIS STATEMENT HAS MANY MANY REPITIVE WORDS HAS IN IT";
//	int count;
//	statement =statement.toLowerCase();
//	String s1[]=statement.split(" ");
//	//System.out.println(s1);
//	for(int i=0;i<s1.length;i++) {
//		count=1;
//		for(int j=i+1;j<s1.length;j++) {
//			if(s1[i].equals(s1[j])) {
//				count++;
//	
//				
//			}
//		}
//		if(count>1) {
//			System.out.println(s1[i]);
//		}
//	}
// }
//}


	String words="This sentence has many words and this words are repetitive ";
	findDuplicate(words);
}
public static  void findDuplicate(String str) {
	String [] wor=str.split(" ");
	Map<String, Integer> wordcount=new HashMap<>();
	for(String word:wor) {
	//Returns the value to which the specified key is mapped,
		wordcount.put(word, wordcount.getOrDefault(word, 0)+1);
		//System.out.println(wordcount);
		
	}
for(Map.Entry<String, Integer> entry:wordcount.entrySet()) {
	if (entry.getValue()>1) {
		System.out.println(entry.getKey()+ " : "+ entry.getValue()+ " times");
	}
}
}
}



//