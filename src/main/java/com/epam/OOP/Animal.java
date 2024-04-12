package com.epam.OOP;

class Main{
    public static void main(String[] args) {
        Animal animal = new Animal("red", 4, false);
        Dog dog = new Dog();
        Bird bird = new Bird();
        System.out.println(animal.getDescription());
    }
}
public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur){
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }
    public String getDescription(){
        String pawOrPaws = numberOfPaws == 1? "paw" : "paws";
        String fur = hasFur? "a" : "no";

        return "This animal is mostly " + color + ". It has " + numberOfPaws + " "
                + pawOrPaws + " and " + fur + " fur.";
    }
}
