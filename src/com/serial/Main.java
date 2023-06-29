package com.serial;

public class Main {
    public static void main(String[] args) {
        // Create a new student
        Student student = new Student("",0,"", "");
        student.setName("John Doe");
        student.setAge(18);
        student.setAddress("123 Main St");

        // Create a driving school instance
        DrivingExample drivingSchool = new DrivingExample();

        // Save student data
        drivingSchool.saveStudent(student);

        // Load student data
        Student loadedStudent = drivingSchool.loadStudent();
        if (loadedStudent != null) {
            System.out.println("Loaded student data:");
            System.out.println(loadedStudent);
        }
    }
}
