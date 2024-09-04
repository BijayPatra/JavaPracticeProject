package FinalKeywordExamples;
/*
Que) Can we initialize blank final variable?
Yes, but only in constructor. For example:*/

class Bike10
{
	final int speedlimit;// blank final variable

	Bike10() 
	{
		speedlimit = 70;
		System.out.println(speedlimit);
	}

	public static void main(String args[]) 
	{
		new Bike10();
	}
}
