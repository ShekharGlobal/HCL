package us.redshift.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInput {

	public static void main(String[] args) {
		StringBuffer content = null;
		FileInputStream fs = null;
		int ch;
		try {
			fs = new FileInputStream("d:\\IOEX\\info.txt");
			content = new StringBuffer();
			while ((ch = fs.read()) != -1) {
				content.append((char) ch);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}

		catch (IOException e) {
			System.out.println("IO Exception");
		} finally {
			try {
				System.out.println(content);
				fs.close();
			} catch (IOException e) {
				System.out.println("Exception");
			}
		}
	}

}
