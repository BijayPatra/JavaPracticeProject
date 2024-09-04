package ExceptionHandelling;

import java.io.*;
/*
 NOTE: If the superclass method does not declare an exception
 
If the superclass method does not declare an exception, subclass overridden method 
cannot declare the checked exception but it can declare unchecked exception.*//*

Rule 1: If the superclass method does not declare an exception, subclass
 overridden method cannot declare the checked exception.*/

class Parent 
{

	// defining the method
	void msg() 
	{
		System.out.println("parent method");
	}
}

public class TestExceptionChild extends Parent 
{

	// overriding the method in child class
	// gives compile time error if we mention IOException, checked exception
	
	void msg() throws ArithmeticException// We cant declared a checked exception in overriden method 
	{
		System.out.println("TestExceptionChild");
	}
	public static void main(String args[]) 
	{
		Parent p = new TestExceptionChild();
		p.msg();
	}
}