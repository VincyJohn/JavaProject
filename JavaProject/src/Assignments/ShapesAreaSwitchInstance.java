package Assignments;
import java.util.Scanner;
public class ShapesAreaSwitchInstance 
{

	public static void main(String[] args) 
	{
double area;
Scanner sc= new Scanner(System.in);
System.out.println("Enter an option");
String s=sc.next();
char p=s.charAt(0);
ShapesAreaSwitchInstance obj1=new ShapesAreaSwitchInstance();
switch(p)
{
case 'a':area=obj1.circleArea();
         System.out.println("Area of Circle is "+area);
         break;
case 'b':area=obj1.rectangleArea();
         System.out.println("Area of Rectangle is "+area);
         break;
case 'c':area=obj1.squareArea();
         System.out.println("Area of Square is "+area);
         break;
default :System.out.println("Invalid input");       
	

}
	}
	
	double circleArea()
	{
		double pi=3.14;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the radius");
		int rad=sc.nextInt();
		double area=pi*rad*rad;
		return area;			
	}
	
	double rectangleArea()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter length");
		int l=sc.nextInt();
		System.out.println("Enter breadth");
		int b=sc.nextInt();
		double area=l*b;
		return area;			
	}
	double squareArea()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter length");
		int l=sc.nextInt();
		double area=l*l;
		return area;			
	}
	

}
