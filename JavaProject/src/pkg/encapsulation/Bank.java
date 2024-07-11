package pkg.encapsulation;

public class Bank 
{
	private int pin;
	
	public void setPin(int pin)
	{
		this.pin=pin;
	}
	
	public int getPin()
	{
		return this.pin;
	}
	
public void validationPin()
{
		String str=String.valueOf(this.pin);
		int count=0;
		if (str.length()>4)
		System.out.println("Given Pin is invalid");
		else
		{
		       int pinarray[] = {1001,1234,1212};
		       for (int i=0;i<pinarray.length;i++)
		       {	
			         if(this.pin==pinarray[i])
			         {
				       System.out.println("Given Pin is valid");
				       count++;
				       break;
			         }
					
		        }
		       
		       if (count==0)
		    	   System.out.println("Given Pin is invalid");
		
	   }
	
}

}


