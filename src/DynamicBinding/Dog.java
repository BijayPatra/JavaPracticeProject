package DynamicBinding;

/*
Dynamic binding
When type of the object is determined at run-time, it is known as dynamic binding*/
//mehtod over ridding is also example of dynamic binding
class Animal 
{
	void eat()
	{
		System.out.println("animal is eating...");
	}
}
class Dog extends Animal 
{
	void eat() 
	{
		System.out.println("dog is eating...");
	}

	public static void main(String args[]) 
	{
		Animal a = new Dog();
		a.eat();
	}
}