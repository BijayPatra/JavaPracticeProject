package AccessModifierExample;

/*Role of Private Constructor
If you make any class constructor private, you cannot create
the instance of that class from outside the class. For example*/

class A 
{
	private A() 
	{
	}// private constructor

	void msg() 
	{
		System.out.println("Hello java");
	}
}
public class Simple
{
	public static void main(String args[]) 
	{
		//A obj = new A();// Compile Time Error
	}
}