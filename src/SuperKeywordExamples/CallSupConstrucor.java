package SuperKeywordExamples;

/*3) super is used to invoke parent class constructor.
 * 
The super keyword can also be used to invoke the parent class constructor.
Let's see a simple example:
*/

class Animal7 
{
	Animal7() 
	{
		System.out.println("animal is created");
	}
}

class Cat extends Animal7 
{
	Cat() 
	{
		super();
		System.out.println("cat is created");
	}
}

class CallSupConstrucor 
{
	public static void main(String args[]) 
	{
		Cat c = new Cat();
	}
}