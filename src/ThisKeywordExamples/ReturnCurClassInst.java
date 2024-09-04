package ThisKeywordExamples;

// this keyword can be used to return current class instance
class Aclass 
{
	Aclass getA()
	{
		return this;
	}

	void msg() 
	{
		System.out.println("Hello java");
	}
}

class ReturnCurClassInst 
{
	public static void main(String args[]) 
	{
		new Aclass().getA().msg();
	}
}
