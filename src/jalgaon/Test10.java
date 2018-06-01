package jalgaon;

public class Test10 
{

	public static void main(String[] args)
	{
		
		//Methods in String Class
		
		//length()
		String x="Welcome to Jalgaon";
		int l=x.length();
		System.out.println(l);
		
		//equalsIgnoreCase
		String p="tushar RajPut";
		String q="tushar rajput";
		if(p.equalsIgnoreCase(q))
		{
			System.out.println("Same text");
		}
		else
		{
			System.out.println("Not same Text");
		}
		
		//contains
		if(p.contains("tush"))
		{
			System.out.println("exits text");
		}
		else
		{
			System.out.println("doesn't exists text");
		}
		
		

	}

}
