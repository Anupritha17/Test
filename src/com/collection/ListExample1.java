package com.collection;

import java.util.*;  
public class ListExample1{  
public static void main(String args[]){  
 List<String> list=new ArrayList<String>();  
 list.add("Orange");  
 list.add("Apple");  
 list.add("Banana");  
 list.add("Guava");  
 for(String fruit:list)  
  System.out.println(fruit);  
}  
}  