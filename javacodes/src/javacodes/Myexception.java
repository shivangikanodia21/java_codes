package javacodes;

class Myexception1 extends Exception
{
	Myexception1()
	{
		System.out.println("salary cant be below 1000");
	}
}



class A 
{
	int a;
	String s;
	A(int a1,String s1)
	{
		
		a=a1;
		s=s1;
	}
	
	public void salaryprocess(int a) throws Myexception1
	{
		if(a<1000)
			throw new Myexception1();
		else
			System.out.println("well done!!");
	}
	
	
}


public class Myexception {
	
	public static void main(String[] args) throws Myexception1 
	{
		A obj=new A(100,"ABS");
		try {
			obj.salaryprocess(100);
		} catch (Myexception1 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
		obj.salaryprocess(10000);}
	}

}
