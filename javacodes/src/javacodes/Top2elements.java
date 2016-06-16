package javacodes;

import java.util.ArrayList;
import java.util.Collections;

public class Top2elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> array1=new ArrayList<Integer>();
		array1.add(1);
		array1.add(2);
		array1.add(100);
		array1.add(4);
		array1.add(100);
		array1.add(20);
		array1.add(30);
		array1.add(409);
		System.out.println(array1);
		int max1=0;
		int max2=0;
		
		for (int i=0;i<array1.size();i++)
		{
			
				if(array1.get(i)>max1)
				{
				max2=max1;
				max1=array1.get(i);
				}
				else if(array1.get(i)>max2)
				{
					max2=array1.get(i);
				}
				else
					continue;
				
		}
		System.out.println(array1);
		
		System.out.println("max1" + max1 + "max2" +max2);
	
		
		/*for (int i=0;i<array1.size();i++)
		{
			for (int j=i+1;j<array1.size();j++)
			{
				if(array1.get(j)>array1.get(i))
						{
					     Collections.swap(array1, i, j);
						}
			}
			System.out.println(array1);
		}
		*/
		/*int max2=array1.get(0);
		int max1=array1.get(0);
		for (int i=1;i<array1.size();i++)
		{
			if(array1.get(i)>max1 )
			{
				max2=max1;
				max1=array1.get(i);
				System.out.println("max1" + max1 + "max2" +max2);
				
			}
		}
		System.out.println("max1" + max1 + "max2" +max2);
		
		*/
		
		
	}

}
