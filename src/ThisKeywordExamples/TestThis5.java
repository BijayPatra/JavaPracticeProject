package ThisKeywordExamples;

//Calling parameterized constructor from default constructor:

class TestDemo 
{
	TestDemo() 
	{
		this(5);
		System.out.println("hello a");
	}

	TestDemo(int x) 
	{
		System.out.println(x);
	}
}

class TestThis5 
{
	public static void main(String args[]) 
	{
		TestDemo a = new TestDemo();
	}
}