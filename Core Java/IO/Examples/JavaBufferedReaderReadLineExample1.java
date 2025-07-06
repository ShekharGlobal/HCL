package us.redshift.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JavaBufferedReaderReadLineExample1 {

	public static void main(String[] args) throws IOException {
		FileReader f = new FileReader("d:\\IOEX\\info.txt");
		BufferedReader b = new BufferedReader(f);
		System.out.println(b.readLine());
		b.close();
		f.close();

	}
}