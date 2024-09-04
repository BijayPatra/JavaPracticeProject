package FinalKeywordExamples;

/*//The variable declared as final in method argument, then the value of that variable
cant be changed.*/

class Bike11 
{
	int cube(final int n)
	{  
	   //n=n+2;//can't be changed as n is final  
	   return n*n*n;  
	}

	public static void main(String args[]) 
	{
		Bike11 b = new Bike11();
		b.cube(5);
	}
}
