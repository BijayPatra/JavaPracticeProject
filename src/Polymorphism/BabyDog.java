package Polymorphism;

class Animal5 
{
	void eat()
	{
		System.out.println("eating");
	}
}

class Dog1 extends Animal5
{
	void eat() 
	{
		System.out.println("eating fruits");
	}
}

class BabyDog extends Dog1 
{
	void eat() 
	{
		System.out.println("drinking milk");
	}

	public static void main(String args[]) 
	{
		Animal5 a1, a2, a3;
		a1 = new Animal5();
		a2 = new Dog1();
		a3 = new BabyDog();
		a1.eat();
		a2.eat();
		a3.eat();
	}
}
