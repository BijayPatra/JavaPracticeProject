package MethodOverLoadingExamples;

public class MethodOverloading3 
{
	
	public void Test(String s) 
	{
		System.out.println("This is string version Method:");
	}
	public void Test(Object ob) 
	{
		System.out.println("This is Object version Method:");
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		MethodOverloading3 md3=new MethodOverloading3();
		md3.Test(new Object());
		md3.Test("Bijay");
		md3.Test(null);
	}

}
