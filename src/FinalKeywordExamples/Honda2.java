package FinalKeywordExamples;

/*Q) Is final method inherited?
Ans) Yes, final method is inherited but you cannot override it. For Example:*/

class BikeDemo
{
	final void run()
	{
		System.out.println("running...");
	}
}

class Honda2 extends BikeDemo 
{
	public static void main(String args[]) 
	{
		new Honda2().run();
	}
}
