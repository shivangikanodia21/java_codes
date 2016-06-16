package javacodes;

import java.util.Scanner;

public class evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner scn= new Scanner(System.in);
            int no=scn.nextInt();
            
            if((no&1)==0)
            	System.out.println("even");
            else
            	System.out.println("odd");
            
            
            if((no<<1)>>1==no)
            	System.out.println("even");
            else
            	System.out.println("odd");
	}

}
