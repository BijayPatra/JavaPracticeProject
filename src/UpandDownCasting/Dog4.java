package UpandDownCasting;

//Downcasting without the use of java instanceof


/*Downcasting can also be performed without the use of instanceof operator
as displayed in the following example:*/

class AnimalTest 
{
}

class Dog4 extends AnimalTest 
{
	static void method(AnimalTest a) 
	{
		Dog4 d = (Dog4) a;// downcasting
		System.out.println("ok downcasting performed");
	}

	public static void main(String[] args) 
	{
		AnimalTest a = new Dog4();
		Dog4.method(a);
	}
}
