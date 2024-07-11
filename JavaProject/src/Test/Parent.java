package Test;

public class Parent 
{

	private void displayPrivate()
	{
	 System.out.println("Private");
	 
	}
	void display()
	{
		 System.out.println("Default");	
	}
	
	protected void displayProtected()
	{
	 System.out.println("Protected");
	 
	}
	
	public void displayPublic()
	{
	 System.out.println("Public");
	}
	 
	
}
