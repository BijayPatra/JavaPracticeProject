package InnerClassesExample;


/*A non-static class that is created inside a class but outside a method is
 *  called member inner class. It is also known as a regular inner class.
 *   It can be declared with access modifiers like public, default, private, and protected.*/

/*Java Member Inner Class Example
 * 
In this example, we are creating a msg() method in the member inner class that 
is accessing the private data member of the outer class.*/

class TestMemberOuter1 
{
	private int data = 30;

	class Inner 
	{
		void msg() 
		{
			System.out.println("data is " + data);//able to access the private member of outer class
		}
	}

	public static void main(String args[]) 
	{
		TestMemberOuter1 obj = new TestMemberOuter1();
		TestMemberOuter1.Inner in = obj.new Inner();
		in.msg();
	}
}
