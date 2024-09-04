package InterFaceExample;

/*An interface in Java is a blueprint of a class. It has static constants and abstract methods.
The interface in Java is a mechanism to achieve abstraction.
There can be only abstract methods in the Java interface, not method body.
It is used to achieve abstraction and multiple inheritance in Java.
In other words, you can say that interfaces can have abstract methods and variables. 
It cannot have a method body.*/

/*It cannot be instantiated just like the abstract class.
Since Java 8, we can have default and static methods in an interface.
Since Java 9, we can have private methods in an interface.*/


/*The abstract class can also be used to provide some implementation of the interface. 
In such case, the end user 
may not be forced to override all the methods of the interface.*/

/*Rule: If you are extending an abstract class that has an abstract method,
you must either provide
the implementation of the method or make this class abstract*/

interface A 
{
	void a();
	void b();
	void c();
	void d();
}

abstract class B implements A
{
	public void c() 
	{
		System.out.println("I am c");
	}
}

class M extends B
{
	public void a() 
	{
		System.out.println("I am a");
	}

	public void b()
	{
		System.out.println("I am b");
	}

	public void d()
	{
		System.out.println("I am d");
	}
}

class InterfaceTest 
{
	public static void main(String args[]) 
	{
		A a = new M();
		a.a();
		a.b();
		a.c();
		a.d();
	}
}