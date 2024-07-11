package pkg.superkeyword;

public class DivisibleBy10 extends AdditionNum 
{
	
public static void main(String[] args)
{

	DivisibleBy10 obj=new DivisibleBy10();	
	obj.divisibleBy10();
}

public void divisibleBy10()
{
	
	int s= super.add();
	if((s%10)==0)
		System.out.println("Sum is divisible by 10");
	else
		System.out.println("Sum is not Divisible by 10");
	
}


}
