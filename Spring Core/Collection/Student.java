package com.hcl.coll;

import java.util.List;

public class Student {
    private List<String> subjects;

    // Setter for DI
    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public void displaySubjects() {
        System.out.println("Subjects: " + subjects);
    }
}
