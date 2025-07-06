package us.redshift.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
       
		FileWriter fw = null;
		String data = "The information to be written to the file";
		fw = new FileWriter("c://shekhar//info.txt");
		fw.write(data);
		System.out.println("success");
		fw.close();

	}

}
