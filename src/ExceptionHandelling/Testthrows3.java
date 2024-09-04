package ExceptionHandelling;

import java.io.*;


/*Case 2: Declare Exception
In case we declare the exception, if exception does not occur, 
the code will be executed fine.
In case we declare the exception and the exception occurs,
it will be thrown at runtime because throws does not handle the exception.*/
class Mtest 
{
	void method() throws IOException 
	{
		System.out.println("device operation performed");
	}
}

class Testthrows3 
{
	public static void main(String args[]) throws IOException // declare exception
	{
		Mtest m = new Mtest();
		m.method();

		System.out.println("normal flow...");
	}
}