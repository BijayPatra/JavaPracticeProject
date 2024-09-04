package ExceptionHandelling;

import java.io.*;

/*
Rule 2: If the superclass method does not declare an exception, 
subclass overridden method cannot declare the checked exception but 
can declare unchecked exception.*/

class ParentTest
{
	void msg() 
	{
		System.out.println("parent method");
	}
}

class TestExceptionChild1 extends ParentTest 
{
	void msg() throws ArithmeticException 
	{
		System.out.println("child method");
	}

	public static void main(String args[]) 
	{
		ParentTest p = new TestExceptionChild1();
		p.msg();
	}
}