package MethodOverridingExamples;

//A real example of Java Method Overriding

/*Consider a scenario where Bank is a class that provides 
functionality to get the rate of interest. However,
the rate of interest varies according to banks. 
For example, SBI, ICICI and AXIS banks could provide 8%, 7%, and 9% rate of interest.
*/
class Bank 
{
	int getRateOfInterest()
	{
		return 0;
	}
}

//Creating child classes.  
class SBI extends Bank 
{
	int getRateOfInterest() 
	{
		return 8;
	}
}

class ICICI extends Bank {
	int getRateOfInterest() {
		return 7;
	}
}

class AXIS extends Bank 
{
	int getRateOfInterest() 
	{
		return 9;
	}
}

//Test class to create objects and call the methods  
class RateOfIntrest 
{
	public static void main(String args[]) 
	{
		SBI s = new SBI();
		ICICI i = new ICICI();
		AXIS a = new AXIS();
		System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());
		System.out.println("ICICI Rate of Interest: " + i.getRateOfInterest());
		System.out.println("AXIS Rate of Interest: " + a.getRateOfInterest());
	}
}