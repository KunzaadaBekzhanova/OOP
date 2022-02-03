package com.company;

public class Student {
    private String nameStudent;
    private String surNAme;
    private int age;

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getSurNAme() {
        return surNAme;
    }

    public void setSurNAme(String surNAme) {
        this.surNAme = surNAme;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
            System.out.println("Age is not negative");
        }
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    private int birthDate;
}
