
package ArrayProgramming;

public class ShortingArrayDecendingUsingGeneralMethod 
{

	public static void main(String[] args) 
	{
		//Initialize array for the process 
		int [] arr = new int [] {16, 2022, 2001, 1997, 7}; 
		int temp = 0;

		//Displaying elements of an original array to go further
		System.out.println("Elements of original array are ---->: ");
		for (int i = 0; i < arr.length; i++)
		{ 
			System.out.print(arr[i] + " ");
		}

		//Sort the array in descending order. Please go further
		for (int i = 0; i < arr.length; i++) 
		{ 
			for (int j = i+1; j < arr.length; j++) 
			{ 
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				} 
			} 
		}
		System.out.println();
		//Displaying elements of array after sorting process done.
		System.out.println("Elements of array sorted in descending order is here ---->: ");
		for (int i = 0; i < arr.length; i++) { 
			System.out.print(arr[i] + " ");
		}
	}
}

