package us.redshift.serialization;

import java.io.Serializable;

//transient
public class Student implements Serializable {
	transient int id;
	 String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
}