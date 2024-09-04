package ExceptionHandelling;

import java.io.*;

/*Note: If we throw unchecked exception from a method,
 *  it is must to handle the exception or declare in throws clause.
 *  
If we throw a checked exception using throw keyword, it is must to handle
the exception using catch block or the method must declare it using throws declaration.*/



public class TestThrow2
{

	// function to check if person is eligible to vote or not
	public static void method() throws FileNotFoundException
	{

		FileReader file = new FileReader("C:\\Users\\Bijay\\Desktop\\abc.txt");
		BufferedReader fileInput = new BufferedReader(file);

		throw new FileNotFoundException();

	}

	// main method
	public static void main(String args[]) {
		try {
			method();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("rest of the code...");
	}
}
