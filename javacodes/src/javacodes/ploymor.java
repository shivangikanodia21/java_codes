package javacodes;

class A1{
	
	public void display()
	{
		System.out.println("class A");
	}
}

class B extends A1
{
	
	public void display()
	{
		System.out.println("class B");
	}
}

class C extends B
{
	
	public void display()
	{
		System.out.println("class C");
	}
}

public class ploymor {
	
	public static void funccall( A1 obj)
	{
		obj.display();
		
		
	}
	
	public static void main(String[] args)
	{
		/*A1 a=new A1();
		funccall(a);
		
		 a=new B();
		 funccall(a);
		
		 a=new C();*/
		 funccall(new B());
	}

}
