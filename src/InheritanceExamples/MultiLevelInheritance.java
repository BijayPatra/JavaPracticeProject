package InheritanceExamples;

//Multilevel Inheritance

class AnimalType
{
	void eat() 
	{
		System.out.println("eating...");
	}
}

class DogType extends AnimalType 
{
	void bark() 
	{
		System.out.println("barking...");
	}
}

class BabyDog extends DogType 
{
	void weep()
	{
		System.out.println("weeping...");
	}
}

class MultiLevelInheritance
{
	public static void main(String args[]) 
	{
		BabyDog d = new BabyDog();
		d.weep();
		d.bark();
		d.eat();
	}
}