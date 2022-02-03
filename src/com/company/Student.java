package com.company;

public class Student {
    private String Student;
    private String SurnameOfstudent;
    private int age;
    private String group;
    private Laptop laptop;

    public String getStudent() {
        return Student;
    }

    public void setStudent(String student) {
        Student = student;
    }

    public String getSurnameOfstudent() {
        return SurnameOfstudent;
    }

    public void setSurnameOfstudent(String surnameOfstudent) {
        SurnameOfstudent = surnameOfstudent;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void coffee(){
        System.out.println("Student is drinking coffee");
    }
    public void food(){
        System.out.println("Student id eating");
    }
    public void showInformation(){
        System.out.println("info");
        System.out.println("name = " + Student);
        System.out.println("Surname = " + SurnameOfstudent);
        System.out.println("age = " + age);
        System.out.println("group = " + group);
        coffee();
        food();
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
}
