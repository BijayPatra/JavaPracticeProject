package MethodOverLoadingExamples;

/*Method Overloading: changing data type of arguments*/
class AdderTest 
{
	static int add(int a, int b)
	{
		return a + b;
	}

	static double add(double a, double b)
	{
		return a + b;
	}
}

class TestOverloading2 
{
	public static void main(String[] args) 
	{
		System.out.println(AdderTest.add(11, 11));
		System.out.println(AdderTest.add(12.3, 12.6));
	}
}