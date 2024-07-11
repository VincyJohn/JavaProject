package ExceptionHandling;

public class ExceptionTryCatch 
{

	public static void main(String[] args) 
	{
		
			int a[]= {10,20,30};
			System.out.println("Before Exception");
			
			try 
			{
				a[3]= 10/1;
			}
			catch (ArithmeticException e)
			{
				System.out.println(e);
			}
			
			catch (ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
			
			catch (Exception e)
			{
				System.out.println(e);
			}
			
			
			System.out.println("After Exception");

		
	}

}
