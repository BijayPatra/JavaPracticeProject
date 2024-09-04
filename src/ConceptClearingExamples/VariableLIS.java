package ConceptClearingExamples;

import java.lang.invoke.VolatileCallSite;

/*Variabls
variabls in java is of three types 
Local variables, Instance veriables and Static variables
Localvariables
variables declared inside methods is called local variables. which are not defined as static
specific to the method. which are not accessable to the other part of the methods or class
Instance Variables
the variables which are declared inside a class are called Instance variables, these variables are called
instance because the value of that variable can be changes each and every instance created by these
class
Static variables
the variable which are declared as static is called static variable, these are static because only
one instance will be created and shared among all the instance created by the class, it wont be static.
memory will be generated only once at the time of class loading first time.
*
*/

public class VariableLIS 
{
	 static int m=100;//static variable//final,private,public,transent and volatile permited 
	 void method()  
	 {    
	    int n=90;//local variable //only final will be permited//no static
	 }  
	 public static void main(String[] args)
	 {
		  int data=50;//instance variable
		  System.out.println(data);
	 }
}
