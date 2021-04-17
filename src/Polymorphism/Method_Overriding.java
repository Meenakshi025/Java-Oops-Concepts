package Polymorphism;

public class Method_Overriding {

	void run()
	{
		System.out.println("Vehicle is running");  
	}  
}

class Bike extends Method_Overriding{  
	void run()
	{
		super.run();
		System.out.println("Bike is running safely");
	}  

	  public static void main(String args[])
	  {  
	  Bike obj = new Bike();  
	  obj.run(); 
	  
	  } 
}
