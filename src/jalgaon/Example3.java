package jalgaon;

public class Example3 
{
	
	public int x;
	public double y;
	public char z;
	public boolean p;
	public String q;
	
	
	
	//Constructor Methods
	 public Example3()
	 {
		 x=99;
		 y=3.14;
		 z='T';
		 p=true;
		 q="rajput";
		 
		 
	 }
	
	 
	 //Constructor Overloading
	 
	 public Example3(int a,double b,char c,boolean d,String e)
	 {
		 x=a;
		 y=b;
		 z=c;
		 p=d;
		 q=e;
	 }
	 
	 //Operational-Methods
	 
	 public void method1()
	 {
		 System.out.println(x+"\n "+y+"\n"+z+" \n"+p+"\n"+q);
	 }
}
//Method-class