package FinalKeywordExamples;

//Final methods are not overrden.

class Bike 
{
	final void run()
	{
		System.out.println("running");
	}
}

class Honda extends Bike 
{
	//void run() //Compile time error Final methods are not override.
	{
		System.out.println("running safely with 100kmph");
	}

	public static void main(String args[])
	{  
	   Honda honda= new Honda();  
	   honda.run(); 
	}
}
