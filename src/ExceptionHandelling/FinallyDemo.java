package ExceptionHandelling;

/**
 * Demo: return statement in all try, cache, finally block. Finally block return
 * statement takes priority.
 */
public class FinallyDemo
{
	public int DemoReturn() 
	{
		try 
		{
			int i = 90 / 9;
			return i ;
		} catch (NullPointerException e ) 
		{
			return 92;
		} 
		finally 
		{
			System.out.println("This is in side finally");
			return 99; // o/p: 99
		}
	}
	public static void main(String[] args) 
	{
		FinallyDemo f=new FinallyDemo();
		f.DemoReturn();
	}
}