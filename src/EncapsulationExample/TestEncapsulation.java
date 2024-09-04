package EncapsulationExample;

//A Java class to test the encapsulated class Account.  
public class TestEncapsulation
{
	public static void main(String[] args) 
	{
		// creating instance of Account class
		Account acc = new Account();
		// setting values through setter methods
		acc.setAcc_no(7560504000L);
		acc.setName("Bijay Kumar");
		acc.setEmail("vijaypatra2681@gmail.com");
		acc.setAmount(500000f);
		// getting values through getter methods
		System.out.println(acc.getAcc_no() + " " + acc.getName() + " " + acc.getEmail() + " " + acc.getAmount());
	}
}
