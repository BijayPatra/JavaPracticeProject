package StringClassJavaProgaramming;

public class StringUpperCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1,str2;
		str1="This is Java Program";
		//str2="JAVA";
		str2="javA";
		
		//boolean res=str1.toUpperCase().contains(str2);
		boolean res=str1.toUpperCase().contains(str2.toUpperCase());
		System.out.println(res);
	}
}
