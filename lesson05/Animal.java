package ru.geekbrains.lesson_e.hw;

public abstract class Animal extends Object {
    protected String name;
    protected String color;
    protected int age;
    protected float jump;
    protected int runningLength;

    public Animal(String name, String color, int age, float jump, int runningLength) {
        this.age = age;
        this.name = name;
        this.color = color;
        this.jump = jump;
        this.runningLength = runningLength;
    }

    public void run() { System.out.println(name + " runs on " + this.runningLength + " meters"); } //бегают все //
    public void jump() { System.out.println(name + " jump on " + this.jump + " meters"); } // прыгают все

    public abstract void swim(); //{ System.out.println(name + " is swimming"); } // плавают не все




}
