package InstanceInitializerBlockExample;

/*What is invoked first,
 *  instance initializer block or constructor?*/

/*
There are mainly three rules for the instance initializer block. They are as follows:
1.The instance initializer block is created when instance of the class is created.
2.The instance initializer block is invoked after the parent class constructor 
	is invoked (i.e. after super() constructor call).
3.The instance initializer block comes in the order in which they appear.*/



class Bike8 
{
	int speed;

	Bike8() 
	{
		System.out.println("constructor is invoked");
	}

	{
		System.out.println("instance initializer block invoked");
	}

	public static void main(String args[]) 
	{
		Bike8 b1 = new Bike8();
		Bike8 b2 = new Bike8();
	}
}
