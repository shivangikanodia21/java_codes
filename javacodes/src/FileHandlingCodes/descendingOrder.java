package FileHandlingCodes;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class descendingOrder {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String TestFile=System.getProperty("user.dir") + "\\TestData1.txt";
		FileInputStream fis=new FileInputStream(TestFile);
		DataInputStream dis =new DataInputStream(fis);
		BufferedReader br= new BufferedReader(new InputStreamReader (dis));
		String line;
		Map<Integer,String> m1=new TreeMap<Integer,String>();
		Map<Integer,String> m2=new TreeMap<Integer,String>();
		m2.put(10,"abc");
		m2.put(20,"abc");
		m2.put(10,"ab");
		System.out.println(m2.entrySet());
        while ((line=br.readLine())!=null)
        {
        	//System.out.println(line);
        	m1.put(line.length(),line);
        	
        	
        }
        System.out.println(m1.entrySet());
        System.out.println(m1.keySet());
        System.out.println(m1.values());
        
	}

}
