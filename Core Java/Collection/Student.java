package com.hcl.coll;
//Userdefined Collection

import java.util.Iterator;
import java.util.Objects;

public class Student extends Object {

	String name;
	int id;
	int score;
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name, score);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Objects.equals(name, other.name) && score == other.score;
	}

	

	public Student(String name, int id, int score) {
		super();
		this.name = name;
		this.id = id;
		this.score = score;
	}

}
