package MethodOverridingExamples;

//Problem Resolved by using Method overriding concept.


class Vehicle1
{
	// defining a method
	void run() 
	{
		System.out.println("Vehicle is running");
	}
}

// Creating a child class
class Bike2 extends Vehicle1
{
	// defining the same method as in the parent class
	void run()
	{
		System.out.println("Bike is running safely");
	}

	public static void main(String args[])
	{
		Bike2 obj = new Bike2();// creating object
		obj.run();// calling method
	}
}