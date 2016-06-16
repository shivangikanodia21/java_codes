package javacodes;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=12345;
		 int reverse = 0;
		while (i!=0)
		{
			reverse=(reverse*10)+ i%10;
			i=i/10;
		}
		
		
	
	    System.out.println("reverse no" + reverse);
	}

}
