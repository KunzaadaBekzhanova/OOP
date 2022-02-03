package com.company;

public class Laptop {
    private String laptopName;
    private int memory;
    private String color;
    private String CPU;

    public void showInfo(){
        System.out.println("laptopName = " + laptopName);
        System.out.println("memory = " + memory);
        System.out.println("color = " + color);
        System.out.println("CPU = " + CPU);
    }

    public String getLaptopName() {
        return laptopName;
    }

    public void setLaptopName(String laptopName) {
        this.laptopName = laptopName;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void turnOn(){
        System.out.println("Laptop is turning ON");
    }
    public void turnOff(){
        System.out.println("Laptop is turning OFF");
    }
}
