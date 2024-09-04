package ThisKeywordExamples;

// This invoke Current Calss Methods();

class A 
{
	void m() 
	{
		System.out.println("hello m");
	}

	void n() 
	{
		System.out.println("hello n");
		//m();//same as this.m(),compiler will internally invoke the current class method.  
		this.m();
	}
}

class TestThis4
{
	public static void main(String args[]) 
	{
		A a = new A();//new A().n(); same
		a.n();
	}
}