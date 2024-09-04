package InterFaceExample;

/*Q) Multiple inheritance is not supported through class in java,
 *  but it is possible by an interface, why?
 *  
As we have explained in the inheritance chapter, multiple inheritance is 
not supported in the case of class because of ambiguity. However, it is supported in case
 of an interface because there is no ambiguity. It is because its implementation is
  provided by the implementation class. For example*/



interface Printable1
{
	void print();
}

interface Showable
{
	void print();
}

class TestInterface3 implements Printable1, Showable
{
	public void print() 
	{
		System.out.println("Hello");
	}

	public static void main(String args[]) 
	{
		TestInterface3 obj = new TestInterface3();
		obj.print();
	}
}
