package JavaProgramming;

import java.util.Scanner;

public class ConsoleInputDemo
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		boolean cond=sc.nextBoolean();
		
		while(cond)
		{
			System.out.println("Do you want to continue.....");
			cond=sc.nextBoolean();			
		}
		System.out.println("End of The Loop:");
	}
}
