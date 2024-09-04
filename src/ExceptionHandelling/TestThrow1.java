package ExceptionHandelling;

public class TestThrow1 
{
	// function to check if person is eligible to vote or not
	public static void validate(int age) 
	{
		if (age < 18) {
			// throw Arithmetic exception if not eligible to vote
			throw new ArithmeticException("Person is not eligible to vote");
		} else {
			System.out.println("Person is eligible to vote!!");
		}
	}

	// main method
	public static void main(String args[])
	{
		// calling the function
		TestThrow1.validate(12);
		//if exception is occured the rest of the code will not execute
		//program exicution will skip after throwing exception in validate method.
		System.out.println("rest of the code...");
	}
}