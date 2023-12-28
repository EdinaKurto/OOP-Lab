package org.lab09.studentManagment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String message) {
        super(message);
    }
}

class EmptyStudentListException extends RuntimeException {
    public EmptyStudentListException(String message) {
        super(message);
    }
}

class Student {
    private int id;
    private String name;
    private String university;
    private String department;
    private double gpa;

    public Student(int id, String name, String university, String department, double gpa) {
        this.id = id;
        this.name = name;
        this.university = university;
        this.department = department;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUniversity() {
        return university;
    }

    public String getDepartment() {
        return department;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student Name: " + name;
    }
}

class StudentSystem {
    private List<Student> students;

    public StudentSystem(String filename) {
        students = readStudents(filename);
    }

    private List<Student> readStudents(String filename) {
        List<Student> studentList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            List<String> lines = br.lines().collect(Collectors.toList());

            for (String line : lines) {
                String[] parts = line.split(",");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return studentList;
    }

    public Optional<Student> getStudentById(int id) {
        return Optional.empty();
    }

    public Student getHighestGPAStudent() throws EmptyStudentListException {
        if (students.isEmpty()) {
            throw new EmptyStudentListException("List of students is empty.");
        }

        return null;
    }

    public Student getLongestNameStudent() throws EmptyStudentListException {
        if (students.isEmpty()) {
            throw new EmptyStudentListException("List of students is empty.");
        }


        return null;
    }

    public List<Student> getAllStudents() {
        return students;
    }
}

class Main {
    public static void main(String[] args) {
        String filename = "students.csv";
        StudentSystem system = new StudentSystem(filename);


        List<Student> allStudents = system.getAllStudents();
        for (Student student : allStudents) {
            System.out.println(student);
        }

        int studentIdToFind = 10;
        Optional<Student> foundStudent = system.getStudentById(studentIdToFind);
        if (foundStudent.isPresent()) {
            System.out.println("Student found: " + foundStudent.get());
        } else {
            try {
                throw new StudentNotFoundException("Student with ID " + studentIdToFind + " not found.");
            } catch (StudentNotFoundException e) {
                e.printStackTrace();
            }
        }

        try {
            Student highestGPAStudent = system.getHighestGPAStudent();
            System.out.println("Student with highest GPA: " + highestGPAStudent);
        } catch (EmptyStudentListException e) {
            e.printStackTrace();
        }

        try {
            Student longestNameStudent = system.getLongestNameStudent();
            System.out.println("Student with longest name: " + longestNameStudent);
        } catch (EmptyStudentListException e) {
            e.printStackTrace();
        }
    }
}
