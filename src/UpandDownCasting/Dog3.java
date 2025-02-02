package UpandDownCasting;

/**
 * When Subclass type refers to the object of Parent class, it is known as
 * downcasting. If we perform it directly, compiler gives Compilation error. If
 * you perform it by typecasting, ClassCastException is thrown at runtime. But
 * if we use instanceof operator, downcasting is possible.
 */
/*
 * If we perform downcasting by typecasting, ClassCastException is thrown at
 * runtime.
 */
/*
 * Dog d=(Dog)new Animal(); //Compiles successfully but ClassCastException is
 * thrown at runtime
 */
class Animal 
{
}

class Dog3 extends Animal 
{
	static void method(Animal a) 
	{
		if (a instanceof Dog3) 
		{
			Dog3 d = (Dog3) a;// downcasting
			System.out.println("ok downcasting performed");
		}
	}

	public static void main(String[] args)
	{
		Animal a = new Dog3();
		Dog3.method(a);
	}

}