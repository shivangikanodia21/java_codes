package javacodes;

public class DectoBinary {

	public static void main(String[] args) {
		
		int num=10;
		int [] array = new int[10];
		int p=0;
		while (num!=0)
		{
			array[p++]=num%2;
			num=num/2;
		}
		
		for (int i=p-1;i>=0;i--)
		{
			System.out.print(array[i]);
		}
		// TODO Auto-generated method stub

	}

}
