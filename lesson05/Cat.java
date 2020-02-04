package ru.geekbrains.lesson_e.hw;

public class Cat extends Animal {

    public Cat(String name, String color, int age, float jump, int runningLength) {
        super(name, color, age, jump, runningLength);
    }

    @Override
    public void swim() { System.out.println(name + "  can't swim "); }

}
