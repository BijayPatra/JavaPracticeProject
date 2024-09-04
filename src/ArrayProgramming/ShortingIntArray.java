package ArrayProgramming;

import java.util.Arrays;

public class ShortingIntArray 
{
	   public static void main(String[] args) 
	   {
	      int[] arr = { 10, 14, 28, 11, 7, 16, 30, 50, 25, 18};
	      System.out.println("The unsorted integer array = "+Arrays.toString(arr));
	      int[] res = arr;
	      Arrays.sort(res);
	      System.out.println("The sorted integer array = "+Arrays.toString(res));
	   }
	}
