package instanceOfOperator;

/*
An object of subclass type is also a type of parent class. For example,
 if Dog extends Animal then object of Dog can be referred by either Dog or Animal class.*/
/*
The instanceof in java is also known as type comparison operator
 because it compares the instance with type. It returns either true or false.
  If we apply the instanceof operator with any variable that has null value, 
  it returns false.*/

class Animal 
{
}

class Dog1 extends Animal 
{// Dog inherits Animal

	public static void main(String args[]) 
	{
		Dog1 d = new Dog1();
		System.out.println(d instanceof Animal);// true
	}
}
