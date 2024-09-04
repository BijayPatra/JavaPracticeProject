package StaticBinding;

//static binding
/*
An object is an instance of particular java class,
but it is also an instance of its superclass.*/

/*When type of the object is determined at compiled time(by the compiler),
it is known as static binding.

If there is any private, final or static method in a class,
there is static binding.*/

/*method oberloading is an example of static binding*/

class Dog
{
	private void eat() 
	{
		System.out.println("dog is eating...");
	}
	public static void main(String args[]) 
	{
		Dog d1 = new Dog();
		d1.eat();
	}
}
