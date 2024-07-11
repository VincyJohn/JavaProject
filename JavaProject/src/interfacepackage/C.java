package interfacepackage;

public class C implements A,B
{

	public static void main(String[] args) 
	{
         C obj=new C();
         obj.print();
         obj.display();
         obj.hello();

	}
	
	@Override
	public void print() 
	{
		
		System.out.println("Print");
	}

	
	public void display()
	{
		System.out.println("Method of Interface A");
	}
	
	public void hello()
	{
		System.out.println("Method of Interface B");
	}



	
}
