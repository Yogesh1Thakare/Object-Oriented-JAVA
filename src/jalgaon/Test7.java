package jalgaon;

public class Test7 
{

	public static void main(String[] args)
	{
		Example7 obj1=new Bodies();
		Bodies obj2=new Bodies();
		
		int o1=obj1.add(10, 20);
		int o2=obj1.sub(100, 10);
		int o3=obj1.div(99, 9);
		int o4=obj1.moduls(99, 9);
		int o5=obj1.mul(50, 100);
		
		System.out.println(o1+" \n"+o2+"\n"+o3+"\n"+o4+" \n"+o5);

		 o1=obj2.add(100, 20);
		 o2=obj2.sub(1000, 10);
		 o3=obj2.div(999, 9);
		 o4=obj2.moduls(999, 9);
		 o5=obj2.mul(500, 100);
		 System.out.println(o1+" \n"+o2+"\n"+o3+"\n"+o4+" \n"+o5);
	}

}
