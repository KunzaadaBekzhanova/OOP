package com.company;

public class Main {

    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.setLaptopName("Funjitsu");
        laptop.setColor("BlACK");
        laptop.setMemory(240);
        laptop.setCPU("Pentium");

        Laptop laptop2 = new Laptop();
        laptop2.setLaptopName("HP");
        laptop2.setColor("Grey");
        laptop2.setMemory(512);
        laptop2.setCPU("Core i5");

        //System.out.println(laptop.getLaptopName()+" "+laptop.getColor()+" "+ laptop.getCPU()+" "+laptop.getMemory());
        laptop.turnOn();
        laptop.turnOff();

        Student student1 = new Student();
        student1.setStudent("Chynara");
        student1.setSurnameOfstudent("Mamatalieva");
        student1.setAge(18);
        student1.setGroup("java-5");
        student1.setLaptop(laptop);
        student1.showInformation();
        laptop.showInfo();

        Student student2 = new Student();
        student2.setStudent("Aichurok");
        student2.setSurnameOfstudent("Turgunbaeva");
        student2.setAge(18);
        student2.setGroup("java-5");
        student2.showInformation();
        laptop2.showInfo();
    }

}
