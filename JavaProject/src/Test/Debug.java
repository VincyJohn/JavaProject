package Test;

public class Debug {

	public static void main(String[] args) 
	{
		
		System.out.println("first Line");
		System.out.println("second Line");
		System.out.println("Starting Debugging");
		AddPgm obj = new AddPgm();
		System.out.println("Method call");
		obj.sample(23,50);
		System.out.println("Stop Debugging");
		
		

	}

}
