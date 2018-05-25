package jalgaon;

public class Example10 
{
	public int x;
	public int y;
	private Example10() //Private Constructor Method
	{
		x=10;
		 y=99;
	}
	
	public static Example10 fill()
	{
		Example10 obj=new Example10();
		return(obj);
	}
	public static Example10 create() //Static Method 
	{
		Example10 obj=new Example10();
		return(obj);
	}
	public void display()
	{
		System.out.print(x);
	}
	
	public void print()
	{
		System.out.print(y);
	}
}
