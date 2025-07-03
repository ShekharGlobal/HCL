package com.hcl.coll;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentRecords {

	public static void main(String[] args) {
		
		Student s1= new Student("Somydeep", 100, 90);
		Student s4= new Student("Somydeep", 100, 90);
		Student s2= new Student("Anjali", 101, 92);
		Student s3= new Student("Vanshika", 102, 93);
		
		
		Set<Student> a1= new HashSet<Student>();
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		a1.add(s4);
		
		
		
		Iterator<Student> i1 = a1.iterator();

        while (i1.hasNext()) {
            Student s = i1.next();
            System.out.println("Name: " + s.name + ", id: " + s.id + ", Marks: " + s.score);
        }
		
		

	}

}
