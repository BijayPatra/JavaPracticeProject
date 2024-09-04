package FinalKeywordExamples;

/*//The variable declared as final we cant change the value
of that variable,*/

/*1. value of a final variable is constant, its value cant be changes
2. final methods are cants override.class
3. class defined as final cant be inherited.*/

//Below example is the demonstration of final variable.

class FinalDemo
{  
	 final int speedlimit=90;//final variable  
	 void run()
	 {  
		 //Wecant change the value of final variable
	  //speedlimit=400;  complitime error
	 }  
	 public static void main(String args[])
	 {  
		 FinalDemo obj=new  FinalDemo();  
		 obj.run();  
	 }  
}//end of class 
