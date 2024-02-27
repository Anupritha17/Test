package com.temenos;

public class Encap {
public static void main(String[] args) {
	Student st=new Student();//Creating the object
	st.setName("ANU PRITHA");
	st.setRollNo(46067501);
	st.setGender("FEMALE");;
	System.out.println("Print the Student Name: "+ st.getName());
	System.out.println("Print the student Roll No : "+ st.getRollNo());
	System.out.println("Print the student Gender : "+ st.getGender());
}
}
