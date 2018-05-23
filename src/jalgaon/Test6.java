package jalgaon;

public class Test6
{

	public static void main(String[] args)
	{
		Example6 obj1=new Provider();
		int o1=obj1.add(99, 9);
		int o2=obj1.mul(99, 9);
		int o3=obj1.divide(99, 9);
		int o4=obj1.sub(99,9);
		
		System.out.println(o1+" \n"+o2+" \n"+o3+" \n"+o4);
		
		Provider obj2=new Provider();
		o1=obj2.add(1000, 10);
		o2=obj2.divide(1000, 10);
		o3=obj2.modulus(1000, 10);
		o4=obj2.mul(1000, 10);
		int o5=obj2.sub(1000, 10);
		
		System.out.println(o1+" \n"+o2+" \n"+o3+" \n"+o4+"\n "+o5);

	}

}
