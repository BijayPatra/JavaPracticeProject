package ConstructorExamples;

/*Constructor Overloading in Java
1.In Java, a constructor is just like a method but without return type.
2.It can also be overloaded like Java methods.

3.Constructor overloading in Java is a technique of having more than one constructor 
	with different parameter lists.
4.They are arranged in a way that each constructor performs a different task. 
5.They are differentiated by the compiler by the number of parameters in the list and their types.*/


//Java program to overload constructors  
class Student5 {
	int id;
	String name;
	int age;

	// creating two arg constructor
	Student5(int i, String n) {
		id = i;
		name = n;
	}

	// creating three arg constructor
	Student5(int i, String n, int a) {
		id = i;
		name = n;
		age = a;
	}

	void display() {
		System.out.println(id + " " + name + " " + age);
	}

	public static void main(String args[]) {
		Student5 s1 = new Student5(111, "Karan");
		Student5 s2 = new Student5(222, "Aryan", 25);
		s1.display();
		s2.display();
	}
}