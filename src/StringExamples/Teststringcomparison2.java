package StringExamples;
//String class equals Igo

/*The Java String class equals() method compares the two given strings based 
 * on the content of the string. If any character is not matched, it returns false. If all characters are matched, it returns true.
The String equals() method overrides the equals() method of the Object class.
*/
class Teststringcomparison2
{
	public static void main(String args[]) 
	{
		String s1 = "Sachin";
		String s2 = "SACHIN";

		System.out.println(s1.equals(s2));// false
		System.out.println(s1.equalsIgnoreCase(s2));// true
	}
}
