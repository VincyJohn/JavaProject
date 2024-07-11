package pkg.encapsulation;

import java.util.Scanner;

public class User {

	public static void main(String[] args) 
	{
		Bank obj= new Bank();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Pin");
		int pin=sc.nextInt();
		obj.setPin(pin);
		obj.validationPin();
		System.out.println("Pin entered is "+obj.getPin());

	}

}
