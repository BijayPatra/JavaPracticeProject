package ThisKeywordExamples;

// this: to pass as an argument in the method

class PassArginMeth 
{
	void m(PassArginMeth obj) 
	{
		System.out.println("method is invoked");
	}

	void p() 
	{
		m(this);
	}

	public static void main(String args[]) 
	{
		PassArginMeth s1 = new PassArginMeth();
		s1.p();
	}
}
