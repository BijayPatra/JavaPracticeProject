package ExceptionHandelling;

import java.io.*;

class ParentDemoTest 
{
	void msg() throws Exception 
	{
		System.out.println("parent method");
	}
}

class TestExceptionChild4 extends ParentDemoTest 
{
	void msg() throws ArithmeticException 
	{
		System.out.println("child method");
	}

	public static void main(String args[])
	{
		ParentDemoTest p = new TestExceptionChild4();

		try {
			p.msg();
		} catch (Exception e) {
		}
	}
}
