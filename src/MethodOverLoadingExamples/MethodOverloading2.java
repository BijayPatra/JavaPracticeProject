package MethodOverLoadingExamples;

public class MethodOverloading2 
{
	public void Method1(int i) 
	{
		System.out.println("This is int arg Method:");
	}
	public void Method1(double d) 
	{
		System.out.println("This is double arg Method:");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MethodOverloading2 md=new MethodOverloading2();
		//md.Method1();
		md.Method1(10);
		md.Method1(10.43);
		md.Method1('a');
		md.Method1(10l);
		md.Method1(10f);

	}

}
