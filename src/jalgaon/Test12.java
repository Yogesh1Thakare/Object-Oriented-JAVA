package jalgaon;

import java.util.Scanner;

public class Test12 
{

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Line");
		String x=sc.nextLine();
		int uppercase=0;
		int lowercase=0;
		int digitnumber=0;
		int specialchar=0;
		
		for(int i=0;i<x.length();i++)
		{
			char y=x.charAt(i);
			if(y>=65 && y<=90)
			{
				uppercase=uppercase+1;
				
			}
			else if(y>=97 && y<=122)
			{
				lowercase=lowercase+1;
				
			}
			else if(y>=48 && y<=57)
			{
				digitnumber=digitnumber+1;
			}
			else
			{
				specialchar=specialchar+1;
			}
		}
		System.out.println("Uppercase Count :"+uppercase);
		System.out.println("Lowercase Count :"+lowercase);
		System.out.println("Digitnumber Count :"+digitnumber);
		System.out.println("Specialchar Count :"+specialchar);
	}

}
