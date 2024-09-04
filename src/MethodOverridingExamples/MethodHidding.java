package MethodOverridingExamples;

class demoTest5
{
	public static void test()
	{
		System.out.println("This is parent:");
	}
}
class demochild extends demoTest5
{
	public static void test()
	{
		System.out.println("This is Child:");
	}
}
public class MethodHidding 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		demoTest5 dt=new demoTest5();
		dt.test();
		
		demochild dc=new demochild();
		dc.test();
		
		demoTest5 dtc=new demochild();
		dtc.test();
	}

}
