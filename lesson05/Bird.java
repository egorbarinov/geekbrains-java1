package ru.geekbrains.lesson_e.hw;

public class Bird extends Animal {

    public Bird(String name, String color, int age, float jump, int runninLenght) {
        super(name, color, age, jump, runninLenght);
    }


    @Override
    public void swim() { System.out.println(name + "  can't swim "); }


}
