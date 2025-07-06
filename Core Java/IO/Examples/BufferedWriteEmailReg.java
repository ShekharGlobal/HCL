package us.redshift.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferedWriteEmailReg {

	public static void main(String[] args) {

		FileWriter fw = null;
		BufferedWriter bw = null;
		Scanner s1 = null;

		s1 = new Scanner(System.in);
		System.out.println("Enter Your Name:");
		String name = s1.next();
		System.out.println("Enter your Email:");
		String email = s1.next();
		String s2 = "Welcome" + " " + name + " " + ", your Email is " + email;

		try {
			fw = new FileWriter("c://shekhar//jf026.txt");
			bw = new BufferedWriter(fw);
			bw.write(s2);
			System.out.println("data written in file");
		} catch (IOException e) {
			e.printStackTrace();
		}

		finally {

			try {
				bw.close();
				fw.close();
				s1.close();
			} catch (IOException e) {

				e.printStackTrace();
			}

		}

	}
}
