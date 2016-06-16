package javacodes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class emp 
{
	String name;
	int id;
	emp(String s,int i)
	{
		name=s;
		id=i;
	}
	
	public String toString()
	{
		return(" id " + this.id);
	}
	
}

class sortemp implements Comparator<emp>
{
	
	public int compare(emp emp1,emp emp2)
	{
		if(emp1.id>emp2.id)
			return 1;
		else
			return -1;
	}
}

public class sortarraylistemp {
	
	public static void main(String[] args)
	{
	
	ArrayList<emp> array1=new ArrayList<emp>();
	array1.add(new emp("akash",10));
	array1.add(new emp("suman",5));
	array1.add(new emp("nikunj",2));
	array1.add(new emp("nikhil",6));
	System.out.println(array1);
	
	Collections.sort(array1,new sortemp());
	System.out.println(array1);
	
	Map<emp,String> m1=new TreeMap<emp,String>(new sortemp());
	m1.put(new emp("akash",10), "a");
	m1.put(new emp("suman",40), "a");
	m1.put(new emp("nikunj",1), "a");
	m1.put(new emp("nikhil",5), "a");
	
	System.out.println(m1.entrySet());
	}
	

}
