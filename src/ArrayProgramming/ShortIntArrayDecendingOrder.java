package ArrayProgramming;

import java.util.Arrays;
import java.util.Collections;

public class ShortIntArrayDecendingOrder 
{
	public static void main(String[] args){
	     // Initializing the array for the process
	     Integer array[] = { 1, 2, 7, 16, 5,6 };

	     // Sorting the array in a descending order
	     Arrays.sort(array, Collections.reverseOrder());

	     // Printing the elements after the process run
	     System.out.println(Arrays.toString(array));
	   }
}
