package com.temenos;

public class Student {
	
		private String name;//Declare the variable in private to protect the data
		private int RollNo;
		private String gender;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getRollNo() {
			return RollNo;
		}
		public void setRollNo(int rollNo) {
			RollNo = rollNo;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		
}
