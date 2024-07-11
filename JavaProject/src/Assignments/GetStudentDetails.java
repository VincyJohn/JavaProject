package Assignments;

import java.util.Scanner;

public class GetStudentDetails
{

	String name,addr;
	int no;
	public static void main(String[] args) 
	{
	
GetStudentDetails obj1= new GetStudentDetails();
Scanner sc= new Scanner(System.in);
System.out.println("Enter a Student name:");
obj1.name=sc.next();
System.out.println("Enter a Student roll number:");
obj1.no=sc.nextInt();
GetStudentAddr obj2= new GetStudentAddr(); // There is no IS-A relationship so need to create object for another class and calling method
obj1.addr=obj2.getAddress();  
obj1.display();

	}
	
	void display()
	{
		System.out.println("Student Details:");
		System.out.println("Student name: "+name);
		System.out.println("Student roll number: "+no);
		System.out.println("Student Address: "+addr);
	}

}
