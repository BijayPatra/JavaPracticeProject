package NextedInterfaceExample;
/*Points to remember for nested interfaces
 * 
1.The nested interface must be public if it is declared inside the interface,
2.but it can have any access modifier if declared within the class.
3.Nested interfaces are declared static*/

interface Showable 
{
	void show();

	interface Message 
	{
		void msg();
	}
}

class TestNestedInterface1 implements Showable.Message 
{
	public void msg() 
	{
		System.out.println("Hello nested interface");
	}
	public static void main(String args[]) 
	{
		Showable.Message message = new TestNestedInterface1();// upcasting here
		message.msg();
	}
}