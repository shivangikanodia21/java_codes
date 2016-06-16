package javacodes;

public class recursiveStringReverse {
	public static String reverse="";
	public static void main(String[] args) throws Exception {
		
		
		String s="JAVA";
		//System.out.println(s.substring(0,s.length()-1));
		
	    String s1=func1(s);
		System.out.println(s1);
	}
		
		
		
		public static String func1(String s) throws Exception
		{
		    if (s.length()<=1)
			{
		    	System.out.println(reverse);
		    	Thread.sleep(15000);
				return s;
			}
				else
				{
					System.out.println(reverse);
			reverse=reverse + s.charAt(s.length()-1) + func1(s.substring(0, s.length()-1));
			
			  return reverse;
				}
			//
			}
			
		
		

	}


