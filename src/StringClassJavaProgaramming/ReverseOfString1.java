package StringClassJavaProgaramming;
public class ReverseOfString1 
{
	public static void main(String[] args) 
	{
		String srt="Hello";
		char[] t1=srt.toCharArray();
		for (int i = t1.length-1;i>=0; i--)
		{
			System.out.print(t1[i]);
		}
	}
}
