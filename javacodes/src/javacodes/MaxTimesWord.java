package javacodes;

import java.util.HashMap;
import java.util.Map;

public class MaxTimesWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Split a string into an array of substrings a into into into";
		String array[];
		array=s.split(" ");
		System.out.println(array.length);
		for (int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
		Map<String,Integer> mp=new HashMap();
		for (int i=0;i<array.length;i++)
		{
			
			if(mp.containsKey(array[i]))
			{
				Integer value=mp.get(array[i]);
				//Integer u=(Integer) value;
				mp.put(array[i],value+1);
			}
			else
				mp.put(array[i], 1);
				
		}
		
		System.out.println(mp.entrySet());
		
		
		

	}

}
