package Polymorphism;

//Rule: Runtime polymorphism can't be achieved by data members.
//for Instance variable the polymorphism concept is not working

class BikeTest 
{
	int speedlimit = 90;
}

class Honda3 extends BikeTest
{
	int speedlimit = 150;

	public static void main(String args[])
	{  
		BikeTest obj=new Honda3();  
	  System.out.println(obj.speedlimit);//90  
	}
}