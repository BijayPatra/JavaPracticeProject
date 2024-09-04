package MethodOverLoadingExamples;

public class MehodOverloading 
{
	public void Method1()
	{
		System.out.println("No arg Method");
	}
	public void Method2(int i) 
	{
		System.out.println("Int arg Method:");
	}
	public void Method3(double d) 
	{
		System.out.println("Double arg Mehod");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MehodOverloading mol=new MehodOverloading();
		mol.Method1();
		mol.Method2(10);
		mol.Method3(10.55);
	}

}
