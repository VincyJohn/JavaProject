package Assignments;

import java.util.Scanner;

public class Onseason
{
	double priceafterdiscount;
	 void discount()
	 {
	 	Scanner sc= new Scanner(System.in);
	 	System.out.println("Enter price on Onseason:");
	 	double price=sc.nextDouble();
	 	priceafterdiscount=price*0.6;
	 	System.out.println("Price after 40% discount on Onseason is "+priceafterdiscount);
	 }

}
