package Abstraction;

public class FullTimeEmployee extends Employee 
{

	@Override
	public void calculateSalary() 
	{
		double payperhour=1000;
		double pay= payperhour * 8;
		System.out.println("Total payment of a full time employee: "+pay);
	}
		
	

}
