package ru.geekbrains.lesson_e.hw;

public class Horse extends Animal {

    private final int swimmsLenghts;

    public Horse(String name, String color, int age, float jump, int runningLength, int swimmsLenghts) {
        super (name, color, age, jump, runningLength);
        this.swimmsLenghts = swimmsLenghts;
    }

    @Override
    public void swim() { System.out.println(name + " is swimms " + swimmsLenghts + " meters"); }

}
