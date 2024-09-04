package StaticKeyword;
/*The static keyword in Java is used for memory management mainly. 
 * We can apply static keyword with variables, methods, blocks and nested classes.
 *  The static keyword belongs to the class than an instance of the class.

The static can be:

1.Variable (also known as a class variable)
2.Method (also known as a class method)
3.Block
4.Nested class*/



/*Understanding the problem without static variable
class Student{  
     int rollno;  
     String name;  
     String college="ITS";  
}  
Suppose there are 500 students in my college, now all instance data members will get memory each time 
when the object is created. All students have its unique rollno and name, 
so instance data member is good in such case. Here, "college" refers to the common property of all objects.
If we make it static, this field will get the memory only once.

Note:Java static property is shared to all objects.*/


//Java Program to demonstrate the use of static variable  
class Student 
{
	int rollno;// instance variable
	String name;
	static String college = "ITS";// static variable
	
	// constructor
	Student(int r, String n)
	{
		rollno = r;
		name = n;
	}

	// method to display the values
	void display() 
	{
		System.out.println(rollno + " " + name + " " + college);
	}

	//Test class to show the values of objects  
	public static void main(String args[])
	{
		Student s1 = new Student(111, "Karan");
		Student s2 = new Student(222, "Aryan");
		//we can change the college of all objects by the single line of code  
		//Student.college="BBDIT";  
		s1.display();
		s2.display();
	}
}