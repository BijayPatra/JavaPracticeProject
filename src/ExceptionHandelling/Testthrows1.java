package ExceptionHandelling;

import java.io.IOException;

/*//Let's see the example of Java throws clause which describes
that checked exceptions can be propagated by throws keyword*/

class Testthrows1 
{
	void m() throws IOException //throws key word only checked exception
	{
		throw new IOException("device error");// checked exception
	}

	void n() throws IOException //caller of the m() method need to define same exception or upper exception
	{
		m();
	}

	void p() 
	{
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}

	public static void main(String args[]) 
	{
		Testthrows1 obj = new Testthrows1();
		obj.p();
		System.out.println("normal flow...");
	}
}