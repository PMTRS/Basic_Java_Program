package Day_03;

public class ClassandObjecct 
{	// Start 
	
	void techclass()
	{
		System.out.println("Hi I am a Method with Name as TENTHClASS");
	}
	
	void salary()
	{
		System.out.println("Hi My Salary is 12000");
	}
	
	void city()
	{
		System.out.println("Hi My City Name is HYDERABAD");
	}
	public static void main(String[] args) 
	{
		ClassandObjecct obj = new ClassandObjecct(); // () CLASS NAME CALLED AS CONSTRUCTORNAME(); 
		obj.city();		// METHODS CALLING
		obj.salary();
		obj.techclass();
		
	}

} // End
