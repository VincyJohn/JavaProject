package Test;

public class Child extends Parent 
{

	public static void main(String[] args) 
	{

Child obj=new Child();
//obj.displayPrivate(); here as this method is defined as private it cannot be accessed in child even though its inheriting the Parent class
obj.display();
obj.displayPublic();
obj.displayProtected();

	}

}
