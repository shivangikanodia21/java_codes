package FileHandlingCodes;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class DistinctWords {
	
	public static void main(String [] a) throws IOException
	{
		String TestFile=System.getProperty("user.dir") + "\\TestData.txt";
		System.out.println(TestFile);
		FileInputStream fis=new FileInputStream(TestFile);
		DataInputStream dis= new DataInputStream(fis);
		BufferedReader br=new BufferedReader(new InputStreamReader(dis));
		Set s1=new HashSet();
		String line = null;
		String[] wordlist=new String[10];
		while((line=br.readLine())!=null)
		{
		wordlist=line.split(" ");
		
		for(int i=0;i<wordlist.length;i++)
		{
			System.out.println(wordlist[i]);
			s1.add(wordlist[i]);
		}
		
		}
		
		System.out.println(s1);
	}

}
