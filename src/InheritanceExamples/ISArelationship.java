package InheritanceExamples;

/*Inheritance: If Object of one class accures the properties and behevior
 * of another calss is called inheritance.main purpose of inheritance is 
 * Reusablities of code. through extends key word we achive the inheritance concept.
 * Clild class having access of member variables and methods of parent class bydefault.
 * There are 3 types of Inheritance in java
 * 1.Simple Inheritance
 * 2.Multilevel Inheritance
 * 3.Hirearchy Inheritance.
 *	Below Example is SIMPLE Inheritance.
 */


class parent
{
	public void M1()
	{
		System.out.println("This is parent:");
	}
}
class child extends parent
{
	public void M2()
	{
		System.out.println("This is Child:");
	}
}
public class ISArelationship 
{

	public static void main(String[] args) 
	{
	

		parent p=new parent();
		p.M1();
		//p.M2();
		
		child ch=new child();
		ch.M1();
		ch.M2();
		
		parent pt=new child();
		pt.M1();
		//pt.m2();
		
	}

}
