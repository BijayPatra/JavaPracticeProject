package StringExamples;

public class EqualsExample3
{
	public static void main(String[] args) 
	{
		String s1 = "javatpoint";
		String s2 = "javatpoint";
		String s3 = "Javatpoint";
		System.out.println(s1.equals(s3)); // True because content is same
		if (s1.equals(s2))
		{
			System.out.println("both strings are equal");
		} else
			System.out.println("both strings are unequal");
	}
}