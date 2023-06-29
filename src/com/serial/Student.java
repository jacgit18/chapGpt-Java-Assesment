package com.serial;


import java.io.*;

class Student implements Serializable {
    private static final long serialVersionUID = -5413923875094806629L;
    private String name;
    private String address;
    private int age;
    private String drivingLicenseNumber;

    public Student(String name, int age, String address, String drivingLicenseNumber) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.drivingLicenseNumber = drivingLicenseNumber;
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String setAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDrivingLicenseNumber() {
        return drivingLicenseNumber;
    }

    public void setDrivingLicenseNumber(String drivingLicenseNumber) {
        this.drivingLicenseNumber = drivingLicenseNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", drivingLicenseNumber='" + drivingLicenseNumber + '\'' +
                '}';
    }
}