package com.serial;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

class DrivingExample {
    private static final String FILE_NAME = "students.json";

    public void saveStudent(Student student) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try {
            String json = gson.toJson(student);
            FileWriter writer = new FileWriter(FILE_NAME);
            writer.write(json);
            writer.close();
            System.out.println("Student data saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving student data: " + e.getMessage());
        }
    }

    public Student loadStudent() {
        Gson gson = new Gson();
        try {
            String json = new String(Files.readAllBytes(Paths.get(FILE_NAME)));
            Student student = gson.fromJson(json, Student.class);
            return student;
        } catch (IOException e) {
            System.out.println("Error loading student data: " + e.getMessage());
            return null;
        }
    }
}
