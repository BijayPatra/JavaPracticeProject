package WithoutMainMethod;

public class demoTest 
{
	static demoTest t=new demoTest();
	demoTest()
	{
		System.out.println("This is posible:");
		System.exit(0);
		//if we are not explicitly exit after printing the above message it will 
		//serch the manin method and it will thorough noMainmehtodDeferror: main
	}
			
}
