package javacodes;

import java.util.StringTokenizer;

public class trimspaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "String    With      Multiple Spaces";
		 System.out.println(str);
		 String newstring="";
		 
	
		 /*
	        StringTokenizer st = new StringTokenizer(str, " ");
	      
	       // StringBuffer sb = new StringBuffer();
	        while (st.hasMoreElements())
	        {
	        	String temp=(String) st.nextElement();
	        	newstring=newstring +temp +" ";
	        }
	     /*   while(st.hasMoreElements()){
	            sb.append(st.nextElement()).append(" ");
	        }*/
	        //System.out.println(newstring);
		 
		 
		 //method 2:
		 
		 
		 String[] temp1=new String[10];
		 temp1=str.split(" ");
		 System.out.println(temp1.length);
		 System.out.println("***"+temp1[1]+"***");
		 for (int i=0;i<temp1.length;i++)
		 {
			 System.out.println(temp1[i]);
			 if(temp1[i].equals(""))
			 {
				 System.out.println("reached loop");
				 newstring=newstring;
			 }
			 else
			 newstring=newstring +temp1[i] +" ";
		 }
		 System.out.println(newstring);
		 
		 System.out.println("hello");
		 System.out.println("hello1");
	}

}
