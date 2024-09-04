package InnerClassesExample;

/*Java static nested class example with a static method
If you have the static member inside the static nested class,
you don't need to create an instance of the static nested class.
*/
public class TestOuter2 
{
	static int data = 30;

	static class Inner
	{
		static void msg()
		{
			System.out.println("data is " + data);
		}
	}
	public static void main(String args[]) 
	{
		TestOuter2.Inner.msg();// no need to create the instance of static nested class
	}
}