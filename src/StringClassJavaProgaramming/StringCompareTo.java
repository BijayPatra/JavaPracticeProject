package StringClassJavaProgaramming;

public class StringCompareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1,str2;
		
		str1="B";//66
		str2="A";//Asccivalue return;65
		
		System.out.println(str2.compareTo(str1));
		str1="A";//65
		str2="B";//Asccivalue return;66
		
		System.out.println(str2.compareTo(str1));	
		
		str1="B";//66
		str2="B";//Asccivalue return;66
		
		System.out.println(str2.compareTo(str1));
		
		str1="ABCz";//
		str2="ABCx";//Asccivalue return;
		
		System.out.println(str2.compareTo(str1));	


	}

}
