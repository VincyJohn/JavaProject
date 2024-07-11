package pkg.superkeyword;

import java.util.Scanner;

public class AdditionNum 
{

	public int add()
	
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter first number:");
	int a=sc.nextInt();	
	System.out.println("Enter second number:");
	int b=sc.nextInt();
	int sum=a+b;
	return sum;
	
	}
	
}
