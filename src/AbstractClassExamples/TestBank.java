package AbstractClassExamples;

abstract class Bank 
{
	abstract double getRateOfInterest();
}

class SBI extends Bank
{
	double getRateOfInterest() 
	{
		return 7.2;
	}
}

class PNB extends Bank 
{
	double getRateOfInterest() 
	{
		return 8.5;
	}
}

class TestBank
{
	public static void main(String args[])
{
	
		Bank b = new SBI();
		System.out.println("Rate of Interest is: " + b.getRateOfInterest() + " %");
		Bank p = new PNB();
		System.out.println("Rate of Interest is: " + p.getRateOfInterest() + " %");
	}
}
