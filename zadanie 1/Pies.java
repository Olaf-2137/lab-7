package com.company.z1;

public class Pies extends Animal{

    public Pies(String name, String color){
        super(name, color);
    }

    public void makeSound() {
        System.out.println(name + " pies koloru " + color + " i robi 'Hau'");
    }
