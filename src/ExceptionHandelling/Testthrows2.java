package ExceptionHandelling;

import java.io.*;
/*
Case 1: We have caught the exception i.e. we have handled the exception
 		using try/catch block.
Case 2: We have declared the exception i.e. specified throws
 		keyword with the method.*/

class M 
{
	void method() throws IOException 
	{
		throw new IOException("device error");
	}
}

public class Testthrows2 
{
	public static void main(String args[]) 
	{
		try {
			M m = new M();
			m.method();
		} catch (Exception e) {
			System.out.println("exception handled");
		}

		System.out.println("normal flow...");
	}
}