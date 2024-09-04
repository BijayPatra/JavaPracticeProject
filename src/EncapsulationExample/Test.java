package EncapsulationExample;

/*Encapsulation in Java is a process of wrapping code and data together into 
 * a single unit, for example, a capsule which is mixed of several medicines.

encapsulation in java
We can create a fully encapsulated class in Java
 by making all the data members of the class private. 
 Now we can use setter and getter methods to set and get the data in it.

The Java Bean class is the example of a fully encapsulated class.*/

class Test 
{
	public static void main(String[] args) 
	{
//creating instance of the encapsulated class  
		Student s = new Student();
//setting value in the name member  
		s.setName("vijay");
//getting value of the name member  
		System.out.println(s.getName());
	}
}
