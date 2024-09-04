package StringClassJavaProgaramming;

public class StringPalemdrom 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str="Radar";
		String reverseStr="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			reverseStr=reverseStr+str.charAt(i);
		}
		if(str.equalsIgnoreCase(reverseStr))
		{
			System.out.println(str +"  Is a palendrom String");
		}
		else 
		{
			System.out.println(str +"Is not a Palendrom String");
		}
	}
}
