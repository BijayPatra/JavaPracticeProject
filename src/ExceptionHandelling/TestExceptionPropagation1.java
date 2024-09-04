package ExceptionHandelling;

//Note: By default, Checked Exceptions are not forwarded in calling chain (propagated).

class TestExceptionPropagation1
{
	void m() 
	{
		int data = 50 / 0;//Arithmetic Exception
		//throw new java.io.IOException("device error");// checked exception
	}

	void n() 
	{
		m();
	}

	void p() 
	{
		try 
		{
			n();
		} catch (Exception e) {
			System.out.println("exception handled only Unchecked Exception");
			//System.out.println("checked Exception wont be handelled");
		}
	}

	public static void main(String args[]) 
	{
		TestExceptionPropagation1 obj = new TestExceptionPropagation1();
		obj.p();
		System.out.println("normal flow...");
	}
}
