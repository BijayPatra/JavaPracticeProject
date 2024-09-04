package InnerClassesExample;
/*
1) Local inner class cannot be invoked from outside the method.
2) Local inner class cannot access non-final local variable till JDK 1.7.
 Since JDK 1.8, it is possible to access the non-final local variable in the 
 local inner class.*/


class localInner2 
{
	private int data = 30;// instance variable

	void display() //inside a method we are declaring a class, called local inner class
	{
		int value = 50;// local variable must be final till jdk 1.7 only
		class Local 
		{
			void msg() 
			{
				System.out.println(value);
			}
		}
		Local l = new Local();
		l.msg();
	}
	public static void main(String args[])
	{
		localInner2 obj = new localInner2();
		obj.display();
	}
}
