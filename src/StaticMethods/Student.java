package StaticMethods;

/*2) Java static method
If you apply static keyword with any method, it is known as static method.

	A static method belongs to the class rather than the object of a class.
	A static method can be invoked without the need for creating an instance of a class.
	A static method can access static data member and can change the value of it.
*/
/*Restrictions for the static method
There are two main restrictions for the static method. They are:

1.The static method can not use non static data member or call non-static method directly.
2.this and super cannot be used in static context.
3. we can call static methods through the calss name
4. non static methods are called by there class object.
5. we cant declare a methods as both static and abstract.because static method must have implementations where as abstract method dont.
6. Static method() can able to change the value of the static variable. below example
*/


//Java Program to demonstrate the use of a static method.  
class Student
{
	int rollno;
	String name;
	static String college = "ITS";

	// static method to change the value of static variable
	static void change() 
	{
		college = "BBDIT";
	}

	// constructor to initialize the variable
	Student(int r, String n)
	{
		rollno = r;
		name = n;
	}

	// method to display values
	void display() 
	{
		System.out.println(rollno + " " + name + " " + college);
	}
	public static void main(String args[]) 
	{
		Student.change();// calling change method
		// creating objects
		Student s1 = new Student(111, "Karan");
		Student s2 = new Student(222, "Aryan");
		Student s3 = new Student(333, "Sonoo");
		// calling display method
		s1.display();
		s2.display();
		s3.display();
	}
}