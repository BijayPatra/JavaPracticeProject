package SingleTonCalssExample;
	
public class privateConstructor 
{
	/*
	 * only one instance will be created at any point of time this class can't be
	 * extended to any other classes specially used in during creation on Single
	 * tone class. if all methods in the class are static then also we can go for
	 * private constructor. its called as constructor delegation. used in Networking
	 * and Database connection creating private constructor
	 */
	private privateConstructor()
	{
		System.out.println("Inside Private Constructor:");
	}
	void display()
	{
		System.out.println("Inside display Method:");
	}
	public static void main(String[] args)
	{
		privateConstructor pc=new privateConstructor();
		pc.display();
		
	}

}
