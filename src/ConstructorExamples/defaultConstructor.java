package ConstructorExamples;


/*There are two rules defined for the constructor.

Constructor name must be the same as its class name
A Constructor must have no explicit return type
A Java constructor cannot be abstract, static, final, and synchronized*/
/*Note: We can use access modifiers while declaring a constructor. 
 * It controls the object creation. In other words,
 *  we can have private, protected, public or default constructor in Java.*/
/*There are two types of constructors in Java:

1.Constructor name must be the same as its class name
2.A Constructor must have no explicit return type
3.A Java constructor cannot be abstract, static, final, and synchronized

Default constructor (no-arg constructor)
Parameterized constructor*/

public class defaultConstructor 
{
	public defaultConstructor()
	{
		System.out.println("Object is Created:");
	}
	public static void main(String[] args)
	{
			new defaultConstructor();//annonumus object creation
	}

}
