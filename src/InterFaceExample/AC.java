package InterFaceExample;

/*The Java compiler adds public and abstract keywords before the interface method.
Moreover, it adds public, static and final keywords before data members.
*/

interface printable 
{
	void print();//By default public,static,final
}

class AC implements printable 
{
	public void print()
	{
		System.out.println("Hello");
	}
}
