package javacodes;

import java.util.Arrays;

public class IncreasArrSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array1=new int[5];
		for (int i=0;i<5;i++)
			array1[i]=i;
		System.out.println(array1.length);
		for (int i=0;i<5;i++)
			System.out.println(array1[i]);
		array1=Arrays.copyOf(array1, array1.length*2);
		System.out.println("hello");
		for (int i=0;i<5;i++)
			System.out.println(array1[i]);
		
		System.out.println(array1.length);
		for (int i=0;i<10;i++)
			array1[i]=i;
		for (int i=0;i<10;i++)
			System.out.println(array1[i]);

	}

}
