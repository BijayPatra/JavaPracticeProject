package SuperKeywordExamples;

/*2) super can be used to invoke parent class method
 * 
The super keyword can also be used to invoke parent class method.
It should be used if subclass contains the same method as parent class.
In other words, it is used if method is overridden.
*/

class Animal6 
{
	void eat()
	{
		System.out.println("eating...");
	}
}
class Monkey extends Animal6 
{
	void eat() 
	{
		System.out.println("eating bread...");
	}

	void bark()
	{
		System.out.println("barking...");
	}

	void work()
	{
		super.eat();
		bark();
	}
}

public class CallSupClassMethod 
{
	public static void main(String args[]) 
	{
		Monkey d = new Monkey();
		d.work();
	}
}