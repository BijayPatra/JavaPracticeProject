package CopyConstructor;
/*There is no copy constructor in Java. However, 
we can copy the values from one object to another like copy constructor in C++.
There are many ways to copy the values of one object into another in Java. They are:

	By constructor
	By assigning the values of one object into another
	By clone() method of Object class
	In this example, we are going to copy the values of one object into another using Java constructor.*/


//Java program to initialize the values from one object to another object.  
class Student6 
{
	int id;
	String name;

	// constructor to initialize integer and string
	Student6(int i, String n)
	{
		id = i;
		name = n;
	}

	// constructor to initialize another object
	Student6(Student6 s) 
	{
		id = s.id;
		name = s.name;
	}

	void display() 
	{
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		Student6 s1 = new Student6(111, "Karan");
		Student6 s2 = new Student6(s1);
		s1.display();
		s2.display();
	}
}
