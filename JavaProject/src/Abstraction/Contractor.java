package Abstraction;

public class Contractor extends Employee
{
	double pay;
	public static void main(String[] args) 
	{
		
		Contractor obj1= new Contractor();
		FullTimeEmployee obj2= new FullTimeEmployee();
		obj1.calculateSalary();
		obj2.calculateSalary();
	}
	public void calculateSalary()
	{
		double payperhour=1000;
		pay= payperhour * 4;
		System.out.println("Total payment of a Contractor for 4 working hours: "+pay);
	}

}
