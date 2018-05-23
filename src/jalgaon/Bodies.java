package jalgaon;

public class Bodies extends Example7 
{

	@Override
	public int sub(int x, int y)
	{
		int z;
		z=x-y;
		return z;
	}

	@Override
	public int mul(int x, int y)
	{
		int z;
		z=x*y;
		return z;
	}

	@Override
	public int div(int x, int y) 
	{
		int z;
		z=x/y;
		return z;
	}

	@Override
	public int moduls(int x, int y) 
	{
		int z;
		z=x%y;
		return z;
	}
	
}
