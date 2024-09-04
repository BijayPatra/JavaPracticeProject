package SwitchCaseExample;

import java.util.Scanner;

public class SwitchCaseTest 
{

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Course Name:");
		String course=sc.nextLine();
		
		switch(course.toLowerCase())
		{
			case "j":
				System.out.println("Java");
				break;
			case "p":
				System.out.println("Python");
				break;
			case "t":
				System.out.println("Testing");
				break;
				
			default:
			System.out.println("This course is Not Exist:");
		}
	}

}
