package SingleTonCalssExample;

public class MySingleton 
{
	static MySingleton instance=null;
	int x=10;
	
	//private constructor cant be accessed outside the class.
	private MySingleton()
	{
		
	}
	public static MySingleton getInstance()
	{
		if(instance==null)
		{
			instance=new MySingleton();
		}
		return instance;
	}
	public static void main(String[] args) 
	{
		MySingleton a=MySingleton.getInstance();
		MySingleton b=MySingleton.getInstance();
			//System.out.println(a);
			//System.out.println(b);
		//both object of this class are same objects.
		a.x=a.x+10;
		System.out.println("Value of a.x= " +a.x);
		System.out.println("Value of b.x= " +b.x);
			
	}
}

