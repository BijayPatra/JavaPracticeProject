package MethodOverridingExamples;
//Run time polymorphisim.dynamic binding
class ParentTest
{
	public void property()
	{
		System.out.println("Cash+Land+Gold received:");
	}
	public void Merrage()
	{
		System.out.println("Merrage Investment:");
	}
}
class childTest extends ParentTest
{
	public void Merrage()
	{
		System.out.println("Trish+NainTara+Tabu:");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MethodOverriding md=new MethodOverriding();
		ParentTest ps=new ParentTest();
		ps.Merrage();
		
		childTest ch=new childTest();
		ch.Merrage();
		
		ParentTest pt=new childTest();
		pt.Merrage();
	}

}
