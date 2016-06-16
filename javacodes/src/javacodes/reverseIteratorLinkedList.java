package javacodes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class reverseIteratorLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList array1=new LinkedList();
		array1.add(1);
		array1.add(2);
		array1.add(3);
		array1.add(4);
		System.out.println(array1);
		ListIterator it1=array1.listIterator();
		
		System.out.println("head->tail then tail->head");
		while(it1.hasNext())
		{
			System.out.println(it1.next());
			
		}
		
		while(it1.hasPrevious())
		{
			System.out.println(it1.previous());
			
		}
		System.out.println("direct reversing the linked list tail->head");
       Iterator it2=array1.descendingIterator();
		
		
		while(it2.hasNext())
		{
			System.out.println(it2.next());
			
		}
		
		
		

	}

}
