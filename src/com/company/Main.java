package com.company;

public class Main {

    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.setLaptopName("Funjitsu");
        laptop.setColor("BlACK");
        laptop.setMemory(240);
        laptop.setCPU("Pentium");

        System.out.println(laptop.getLaptopName()+" "+laptop.getColor()+" "+ laptop.getCPU()+" "+laptop.getMemory());
        laptop.turnOn();
        laptop.turnOff();
    }
}
