package Assignments;

import java.util.Scanner;

public class Offseason extends Onseason
{
	double priceafterdiscount;
   public static void main(String[] args)
   {
	   
	   Offseason obj1=new Offseason();
	   obj1.discount();
	   
   }
	
	 void discount()
	 {
		 super.discount();
		 Scanner sc= new Scanner(System.in);
	 	System.out.println("Enter price on Offseason:");
	 	double price=sc.nextDouble();
	 	priceafterdiscount=price*0.85;
	 	System.out.println("Price after 15% discount on Offseason is "+priceafterdiscount);
	 }
}
