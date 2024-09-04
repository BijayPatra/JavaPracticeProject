package AccessModifierExample;

class Atest 
{
	private int data = 40;
	private void msg() 
	{
		System.out.println("Hello java");
	}
}
public class Private 
{
	public static void main(String args[]) 
	{
		Atest obj = new Atest();
		// System.out.println(obj.data);// Compile Time Error
		// obj.msg();// Compile Time Error
	}
}
