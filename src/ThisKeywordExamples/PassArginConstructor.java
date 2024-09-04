package ThisKeywordExamples;

class B 
{
	PassArginConstructor obj;

	B(PassArginConstructor obj) 
	{
		this.obj = obj;
	}

	void display() 
	{
		System.out.println(obj.data);// using data member of A4 class
	}
}

class PassArginConstructor 
{
	int data = 10;

	PassArginConstructor() 
	{
		B b = new B(this);
		b.display();
	}

	public static void main(String args[]) 
	{
		PassArginConstructor a = new PassArginConstructor();
	}
}