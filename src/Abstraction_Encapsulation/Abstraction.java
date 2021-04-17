package Abstraction_Encapsulation;

public class Abstraction {
	// This example is abstraction and encapsulation
	public String name;	
	
	public void insert(String name)
	{
		validateData(name);
		// code for insert into database
	}
	
	private boolean validateData(String name)
	{
		
		if(name !="")
		{		
			return true;
		}
		else
		{		
			return false;
		}		
	}
	

}
class Program 
{
	public static void Main(String args[])
	{
		
		Abstraction abstraction = new Abstraction();
		//abstraction.validateData("");
		abstraction.insert("Meenakshi");
		
	}
}
