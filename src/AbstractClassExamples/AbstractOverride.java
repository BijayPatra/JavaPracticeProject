package AbstractClassExamples;

abstract class ParentME
{
	public abstract void meth();
	
}
class ChildME extends ParentME
{
	public void meth()
	{
		System.out.println("This is child Mehtod:");
	}
}
public class AbstractOverride 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		AbstractOverride abo=new AbstractOverride();
//		ParentME pm=new ParentME();
		ChildME ch=new ChildME();
		ch.meth();
		
	}

}
