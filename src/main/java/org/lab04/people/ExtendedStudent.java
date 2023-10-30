package org.lab04.people;

import java.util.ArrayList;
import java.util.List;

public class ExtendedStudent extends Student {
    private String student_id;
    private List<Integer> grades;

    public ExtendedStudent(String initialName, String initialAddress, String student_id) {
        super(initialName, initialAddress);
        this.student_id = student_id;
        this.grades = new ArrayList<>();
    }

    public String getStudentId() {
        return student_id;
    }

    public void setStudentId(String student_id) {
        this.student_id = student_id;
    }

    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
        } else {
            System.out.println("Invalid grade.Grades must be between 0 and 100.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\n   " +"Student ID: " + student_id + "\n   " + "Grades: " + grades;
    }
}


