package javacodes;

public class RecurSumofdigit {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no=127;
		
		int sum=func(no);
		System.out.println(sum);
	}
		
		public static int func(int num)
		{
			int sum=0;
			if(num/10==0)
				return num;
			else
			{
				sum=sum+num%10+func(num/10);
			    return sum;
			}
		}
		
		

	}


