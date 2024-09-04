package ThisKeywordExamples;
/*
3) this() : to invoke current class constructor
The this() constructor call can be used to invoke the current class constructor.
It is used to reuse the constructor. In other words, it is used for constructor chaining.

Calling default constructor from parameterized constructor:*/


class Thistest
{
	Thistest() 
	{
		System.out.println("hello default constructor");
	}

	Thistest(int x) 
	{
		this();//calling the default constructor.
		System.out.println(x);
	}
	public static void main(String args[]) 
	{
		Thistest a = new Thistest(10);
	}
}
