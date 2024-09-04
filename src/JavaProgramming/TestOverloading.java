package JavaProgramming;
class Animal
{
	public void test() 
	{
		System.out.println("This is inside animal class:");
	}
}
class Monkey extends Animal
{
	public void demo()
	{
		System.out.println("This is inside Monkey class:");
	}
}
public class TestOverloading 
{
	public void Method1(Animal a)
	{
		System.out.println("Animal version Mehtod:");
	}
	public void Method1(Monkey m)
	{
		System.out.println("Monkey version Method:");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestOverloading ts=new TestOverloading();
		Animal an=new Animal();
		ts.Method1(an);
		
		Monkey m=new Monkey();
		ts.Method1(m);
		
		Animal a=new Monkey();
		ts.Method1(a);

	}

}
