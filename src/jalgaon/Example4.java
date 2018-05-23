package jalgaon;

public class Example4 
{
	public int x,y,z;
	
	
	//Methods Overloading
	public int add(int a)
	{
		x=a;
		int r=x+y+z;
		return (r);
		
	}
	
	public int add(int a,int b)
	{
		x=a;
		y=b;
		int r=x+y+z;
		return (r);
		
	}
	
	public int add(int a,int b,int c)
	{
		x=a;
		y=b;
		z=c;
		int r=x+y+z;
		return(r);
	}
	
	
}
