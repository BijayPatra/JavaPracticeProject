package ConditionStatementElseIf;

import java.util.Scanner;

public class NestedIfDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.out.println("Enter Course Name:");
		Scanner sc=new Scanner(System.in);
		String course=sc.nextLine();
		
		
		if(course.equalsIgnoreCase("j")) 
		{
			System.out.println("Java");
		}
		else if(course.equalsIgnoreCase("p")) 
		{
			System.out.println("Python");
		}
		else if(course.equalsIgnoreCase("t"))
		{
			System.out.println("Testing");
		}
		else 
		{
			System.out.println("Course does not exist");
		}

	}

}
