package com.day.three;

class Stati {
int empNo;
String empName;
//variable declare as static
static String company="Capgemini";
Stati (int EmpNo,String EmpName ) {
	this.empNo=EmpNo;
	this.empName=EmpName;
}
//method declare as static 
public static int test(int a, int b) {
	return a+b;
}

void display() {
	System.out.println("EmployeNo: "+ empNo + " Employe Name :"+empNo +" Company: "+ company );
	company="CG";
}
}
public class Stat {
	static int simple() {
		System.out.println("print the method static");
		return 0;
	}
	public static void main(String[] args) {
		Stati newobj=new Stati(469087, "ANU");
		Stati newobj2=new Stati(46789, "PRITHA");
		//Stat newsim=new Stat();
		simple();
		int c=Stati.test(20, 30);
		Stati.company="CG";
		newobj.display();
		newobj2.display();
		System.out.println(c);
		
		
	}
}


