package Test;

public class Rectangle extends Shapes
{

	public static void main(String[] args) 
	{
		Rectangle obj1= new Rectangle();
		Circle obj2= new Circle();
		Triangle obj3=new Triangle();
		obj1.findArea();  // here method overriding is happening so only respective child class findArea method is only getting called
		obj2.findArea();  // here method overriding is happening so only respective child class findArea method is only getting called
	   // here findArea() method from parent class is not getting called as its overriding
		obj3.findArea();
	}
	
	@Override  // annotation to mention we are overriding this method
		void findArea()
		{
			int area=23*25;
			System.out.println("Area of Rectangle: "+area);
		}
		

}

