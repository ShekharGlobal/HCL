package us.redshift.io;
import java.io.*;


public class ReadFileDemo {
	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("c:\\shekhar\\info.txt");
		BufferedReader br = new BufferedReader(fr);

		System.out.println("Reading the file using readLine() method:");
		
		String c = br.readLine();
		
		while (c != null) {
			System.out.println(c);
			c = br.readLine();
			
		}
		br.close();
	}

}
