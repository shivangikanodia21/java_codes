package javacodes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set set1=new HashSet();
		set1.add(100);
		set1.add(102);
		set1.add(140);
		set1.add(100);
		System.out.println(set1);
		
		Iterator it1=set1.iterator();
		System.out.println(it1.next());
		
		
		

	}

}
