package InheritanceExamples;

class Animal1 
{
	void eat() 
	{
		System.out.println("eating...");
	}
}

class Dog1 extends Animal1 
{
	void bark() 
	{
		System.out.println("barking...");
	}
}

class Cat1 extends Animal1
{
	void meow() 
	{
		System.out.println("meowing...");
	}
}

class HierarchialInheritance 
{
	public static void main(String args[])
	{
		Cat1 c = new Cat1();
		c.meow();
		c.eat();
//c.bark();//C.T.Error  
	}
}