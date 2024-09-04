package ThisKeywordExamples;

/*2) this: to invoke current class method
You may invoke the method of the current class by using the this keyword.
If you don't use the this keyword, compiler automatically adds this keyword 
while invoking the method. Let's see the example
*/
public class Test 
{
	void meth()
	{
		System.out.println("This is meth");
	}
	void demo() 
	{
		System.out.println("This is demo");
		meth();
		//this.meth();
	}	
	public static void main(String[] args) 
	{
		new Test().demo();
	}
}