package SuperKeywordExamples;

/*1) super is used to refer immediate parent class instance variable.
 * 
 * 
We can use super keyword to access the data member or field of parent class.
It is used if parent class and child class have same fields.
Super Keywod Uses
1. calling the immidiate parent class instance variable
2. calling the immidiate parent class Method();
3. calling the immidiate parent class constructor();
*/

class Animal
{
	String color = "white";
}

class Dog extends Animal 
{
	String color = "black";

	void printColor() 
	{
		System.out.println(color);// prints color of Dog class
		System.out.println(super.color);// prints color of Animal class
	}
}

class CallIntVariable 
{
	public static void main(String args[]) 
	{
		Dog d = new Dog();
		d.printColor();
	}
}