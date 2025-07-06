package us.redshift.io;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FileBufferOutput {

	public static void main(String[] args) throws Exception {

		FileOutputStream fs = null;
		BufferedOutputStream bs = null;
		
		
		Scanner s1 = null;
		s1= new Scanner(System.in);
		
		
		System.out.println("Enter employee Id:");
		int empid = s1.nextInt();
		
		System.out.println("Enter Employee Name:");
		String empname = s1.next();
		
		String s2 = "Welcome" + " " + empname + " " + ", your EmployeeId is " + empid;

		fs = new FileOutputStream("D://IOEX//infofeb.txt",true);
		bs = new BufferedOutputStream(fs);
		
		bs.write(s2.getBytes());
		
		System.out.println("data written in file");
		
		bs.close();
		fs.close();
		s1.close();
	}

}
