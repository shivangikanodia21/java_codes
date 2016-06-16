package javacodes;


abstract class AA {
	
	abstract void method1();
	private int i;
	public void set1(int a)
	{
		this.i=a;
	}
	
	public int  geti()
	{
		return this.i;
	}
	

}

class AB extends AA{
	
	 void method1()
	 {
		 System.out.println("helllo there!!!");
	 }

}



public class Abstractest {
	
	public static void main(String[] args)
	{
		AB obj1=new AB();
		obj1.set1(100);
		System.out.println(obj1.geti());
		
		
		AB obj=new AB();
		obj.method1();
		
	}

}
