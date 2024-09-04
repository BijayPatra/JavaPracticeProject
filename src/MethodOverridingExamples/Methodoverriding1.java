package MethodOverridingExamples;

class Parentclass
{
	public Object test()
	{
		System.out.println("This is inside Parentclass:");
		return null;
	}
	
}
class Childclass extends Parentclass
{
	public String test()
	{
		return null;
	}
}
public class Methodoverriding1 
{

	public static void main(String[] args) 
	{	
		Parentclass pclss=new Parentclass();
		pclss.test();
	}

}
