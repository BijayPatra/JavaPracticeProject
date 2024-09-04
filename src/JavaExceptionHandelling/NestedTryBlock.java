package JavaExceptionHandelling;

public class NestedTryBlock
{

	public static void main(String[] args) 
	{
		
		try {
			try {
				System.out.println("Going to devide by Zero:");
				int b=39/0;
			}catch(ArithmeticException e) {
				System.out.println(e);
				
			}
			try {
				int a[]=new int[5];
				a[5]=4;
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			System.out.println("Other Statements:");
		}
		catch(Exception e) {
			System.out.println("Handel the Exception(Outer Catch block)");
		}
		System.out.println("Normal Flow:");
	}
}
