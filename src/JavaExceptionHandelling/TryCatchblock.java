package JavaExceptionHandelling;

public class TryCatchblock {

	public static void main(String[] args) {
		try
		{
			int data=50/0; //may throw exception 
		}
            //handling the exception
		catch(ArithmeticException e)
		{
			System.out.println(e);
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("rest of the code");
	}
	
}
