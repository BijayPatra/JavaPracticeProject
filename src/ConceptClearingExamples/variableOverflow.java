package ConceptClearingExamples;

public class variableOverflow 
{
	public static void main(String[] args)
	{  
		//Overflow  
		int a=130;  
		byte b=(byte)a;  
		System.out.println(a);  
		System.out.println(b);  
	}
}
