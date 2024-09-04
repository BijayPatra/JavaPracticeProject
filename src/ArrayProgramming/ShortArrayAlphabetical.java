package ArrayProgramming;

import java.util.Arrays;

public class ShortArrayAlphabetical
{
	   public static void main(String[] args) 
	   {
	      String[] strArr = new String[] { "r", "p", "v","y", "s", "q" ,"t","u" };
	      System.out.println("Sort array in alphabetical order...");
	     
	      Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
	      for (int a = 0; a < strArr.length; a++) 
	      {
	         System.out.println(strArr[a]);
	      }
	   }
	}