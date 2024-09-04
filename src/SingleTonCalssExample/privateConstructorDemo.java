package SingleTonCalssExample;

public class privateConstructorDemo 
{
	private static privateConstructorDemo pcd;
	
	private privateConstructorDemo()
	{
		
	}
	public static privateConstructorDemo getInstance()
	{
		if(pcd==null)
		{
			pcd=new privateConstructorDemo();
		}
		return pcd;
	}
	public static void main(String[] args)
	{
		privateConstructorDemo pcd= privateConstructorDemo.getInstance();
		privateConstructorDemo pcd1=privateConstructorDemo.getInstance();
		//no different object only one instance
		System.out.println(pcd.equals(pcd1));	
	}
}
