package Test;

public class AddPgm {

	public static void main(String[] args)
	{
	
		int a=123;
		int b=456;
		AddPgm obj = new AddPgm();
		obj.sample(a,b);

	}
	
	void sample(int x, int y)
	{
		int sum= x+y;
		System.out.println("Sum is "+sum);
	}

}
