package JavaProgramming;

public class AutoPromotionType 
{
	public void test(int i) 
	{
		System.out.println("This is in side Integer Method");
	}
	public void test(float j) 
	{
		System.out.println("This is in side float Method");
			
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		AutoPromotionType at=new AutoPromotionType();
		at.test(10);
		at.test(10l);
		//at.test(a);
		//at.test(10.5);
	}
}
