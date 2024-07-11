package Test;

import java.util.Scanner;

public class TestPgm 
{

	String str;
	
	public static void main(String[] args) 
	{
	
			
TestPgm obj = new TestPgm("Test");
obj.display();
	}
	
	TestPgm(String s)
	{
		str=s;
	}
	void display()
	{
		
		System.out.println("String is "+str);
		
	}
	

}
