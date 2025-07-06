package us.redshift.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BuffferedWriterDemo {

	public static void main(String[] args) throws IOException {
        BufferedWriter bw= null;
		FileWriter fw = null;
		String data = "The information to be written to the file";
		fw = new FileWriter("d://IOEX//info2.txt");
		bw= new BufferedWriter(fw);
		bw.write(data);
		bw.newLine();
		bw.write("welcome");
		System.out.println("success");
		bw.close();

	}

}

