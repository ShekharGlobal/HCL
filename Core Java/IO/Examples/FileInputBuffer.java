package us.redshift.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputBuffer {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fs= null;
		BufferedInputStream bs= null;
		
		fs= new FileInputStream("D:\\IOEX\\infofeb.txt");
		bs= new BufferedInputStream(fs);
		
		byte[] content= new byte[1024];
		
		int byteRead=0;
		
		String s1 = null;
		
		while((byteRead= bs.read(content))!=-1) {
			s1= new String(content,0, byteRead);
			System.out.println(s1);
			
		}
		
		bs.close();
	}

}
