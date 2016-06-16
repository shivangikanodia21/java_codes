package javacodes;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class reverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList ls=new LinkedList();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		ls.add(5);
		ls.add(6);
		Iterator it1=ls.iterator();
		ListIterator it2=ls.listIterator();
		while (it1.hasNext())
			System.out.println(it1.next());
		
		while (it2.hasNext())
			System.out.println(it2.next());
		while(it2.hasPrevious())
			System.out.println(it2.previous());
		

	}

}
