package Text1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Textfile 
{
	public static void main(String[] args) throws IOException 
	{
		File f=new File("../TextDoc/Demo.txt");
		FileReader fr=new FileReader(f);  //character by character 
		BufferedReader bf=new BufferedReader(fr);//to read line by line code
		
		String s;
		
		while((s=bf.readLine())!=null)
		{
			System.out.println(s);
		}
	}
}
