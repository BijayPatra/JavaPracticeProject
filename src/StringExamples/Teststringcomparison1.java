package StringExamples;
//String Class equals() compares the content of two string with individual aski code.
/*It returns boolean value true if the 
two strings content value is same, if not it will return false.
*/
class Teststringcomparison1 
{
	public static void main(String args[]) 
	{
		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = new String("Sachin");
		String s4 = "Saurav";
		System.out.println(s1.equals(s2));// true
		System.out.println(s1.equals(s3));// true
		System.out.println(s1.equals(s4));// false
	}
}