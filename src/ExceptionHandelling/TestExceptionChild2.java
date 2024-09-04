package ExceptionHandelling;

import java.io.*;
/*
Rule 1: If the superclass method declares an exception, subclass overridden 
method can declare the same, subclass exception or no exception but cannot
 declare parent exception.*/

class ParentDemo 
{
	void msg() throws ArithmeticException 
	{
		System.out.println("parent method");
	}
}

public class TestExceptionChild2 extends ParentDemo 
{
	void msg()//no exp,subclass exp or same as parent exp but no super of parent class exception
	{
		System.out.println("child method");
	}

	public static void main(String args[])
	{
		ParentDemo p = new TestExceptionChild2();

		try {
			p.msg();
		} catch (Exception e) {
		}

	}
}
