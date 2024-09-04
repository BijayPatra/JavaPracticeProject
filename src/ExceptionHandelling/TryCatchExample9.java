package ExceptionHandelling;

public class TryCatchExample9 
{

	public static void main(String[] args)
	{
		try {
			int arr[] = { 1, 3, 5, 7 };
			System.out.println(arr[10]); // may throw exception
		}
		// handling the array exception
		catch (IndexOutOfBoundsException e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("rest of the code");
	}

}
