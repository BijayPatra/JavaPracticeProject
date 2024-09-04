package ArrayProgramming;

import java.util.Arrays;

public class ShortArrayCaseSencentiveOrder 
{
	public static void main(String args[])
	{
		String[] arr = new String[] { "apple", "mango", "Banana", "Melon", "orange" };
		System.out.print("The unsorted array is: ");
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.print("The sorted array in case-sensitive order is: ");
		System.out.println(Arrays.toString(arr));
	}
}
