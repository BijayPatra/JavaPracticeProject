package ExceptionHandelling;

public class Multicatch 
{
	public void meht()
	{
		int i,j;
		j=0;
		
		try
		{
			i=50/j;
			System.out.println("This will not exicute"+i);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("This code need to be exicute if any exception");
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		Multicatch mc=new Multicatch();
		mc.meht();
	}
}
