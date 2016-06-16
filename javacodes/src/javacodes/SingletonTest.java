package javacodes;

public class SingletonTest {
	
	private static SingletonTest obj;
	
	static{
		System.out.println("static");
		obj = new SingletonTest();
	}
	
	private SingletonTest()
	{
		System.out.println("constructor called");
	}
	
	private SingletonTest(int i)
	{
		System.out.println("constructor int called" + i);
	}

	private static void test()
	{
		System.out.println("hello");
	}
	public static void main(String[] args) {
		
		SingletonTest s1=new SingletonTest();
		s1.test();
		
		SingletonTest s2=new SingletonTest(10);
		s1.test();
		
		SingletonTest s3=new SingletonTest(100);
		s1.test();
		
		
		
		/*SingletonTest s2=s1.test();
		System.out.println(s2.test());
		
		System.out.println(obj.test());
		
		SingletonTest s4=new SingletonTest();
		System.out.println(s4.test());*/
		

	}

}
