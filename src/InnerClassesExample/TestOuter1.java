package InnerClassesExample;

/*It can access static data members of the outer class, including private.
The static nested class cannot access non-static (instance) data members*/
/*
A static class is a class that is created inside a class, is called a
static nested class in Java. It cannot access non-static data members and methods.
It can be accessed by outer class name.*/

class TestOuter1 
{
	static int data = 30;

	static class Inner 
	{
		void msg() 
		{
			System.out.println("data is " + data);
		}
	}

	public static void main(String args[]) 
	{
		TestOuter1.Inner obj = new TestOuter1.Inner();
		obj.msg();
	}
}