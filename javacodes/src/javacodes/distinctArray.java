package javacodes;

import java.util.HashMap;

public class distinctArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//distinct elements in an array
		int [] arr={2,2,3,5,6,6,7,4,5,6};
		int [] arr1=new int [10];
		int count=0;
		System.out.println("hello");
		for (int i=0;i<arr.length;i++)
		{
			int flag=0;
			for (int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					flag=1;
					break;
				}
				
			}
			if(flag==0)
				arr1[count++]=arr[i];
				
		}
		for (int i=0;i<count;i++)
		System.out.println(arr1[i]);
		
		
		
		//distinct words in an sentence
	   String s="How many many words how many";
	   String [] splits;
	   splits=s.split(" ");
	   int flag;
	   for (int i=0;i<splits.length;i++)
	   {
		   flag=0;
		   for (int j=i+1;j<splits.length;j++)
		   {
			   if(splits[i].equals(splits[j]))
			   {
				   flag=1;
				   break;
			   }
				   
		   }
		   if (flag==0)
			   System.out.println(splits[i]);
	   }
	   
	   
	   HashMap hm=new HashMap();
	   hm.put(1,"a");
	   hm.put(2,"a");
	   hm.put(3,"a");
	   hm.put(4,"a");
	   System.out.println(hm.keySet());
	   System.out.println(hm.values());
	   
	   
	   
			   
	}

}
