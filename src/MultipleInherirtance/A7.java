package MultipleInherirtance;

/*//Multiple inheritance in Java by interface
 * 
If a class implements multiple interfaces, or an interface extends multiple interfaces, 
it is known as multiple inheritance.
*/
interface Printable 
{
	void print();
}

interface Showable 
{
	void show();
}

class A7 implements Printable, Showable 
{
	public void print() 
	{
		System.out.println("Hello");
	}

	public void show() 
	{
		System.out.println("Welcome");
	}

	public static void main(String args[]) 
	{
		A7 obj = new A7();
		obj.print();
		obj.show();
	}
}
