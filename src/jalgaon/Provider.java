package jalgaon;

public class Provider implements Example6
{

	@Override
	public int add(int x, int y)
	{
		int z;
		z=x+y;
		return (z);
	}

	@Override
	public int sub(int x, int y) 
	{
		int z;
		z=x-y;
		return (z);
		
	}

	@Override
	public int divide(int x, int y) 
	{
		
		int z;
		z=x/y;
		return (z);
	}

	@Override
	public int mul(int x, int y)
	{
		int z;
		z=x*y;
		return (z);
		
	}
	
	public int modulus(int x,int y)
	{
		int z;
		z=x%y;
		return(z);
	}
	
	
}
