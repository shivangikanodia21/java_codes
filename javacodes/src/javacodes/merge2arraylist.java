package javacodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class merge2arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList array1=new ArrayList();
		array1.add(1);
		array1.add(2);
		array1.add(3);
		array1.add(4);
		System.out.println(array1);
		ArrayList array2=new ArrayList();
		array2.add(11);
		array2.add(12);
		array2.add(13);
		array2.add(14);
		System.out.println(array2);
		//array2.addAll(array1);
		//System.out.println(array2);
		
		Collections.sort(array2);
		System.out.println(array2);
		System.out.println("new array");
		ArrayList array3=new ArrayList();
		
		array3.addAll(array1);
		array3.addAll(array2);
		//array3.clear();
		//System.out.println("claer array");
		//System.out.println(array3);
		array3.addAll(array2);
		System.out.println(array3.size());
		System.out.println(array3);
		System.out.println(array3.containsAll(array2));
		System.out.println(array3.subList(2, 5));
		System.out.println(array3.get(0));
		
		
		
	}

}
