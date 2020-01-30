package ru.geekbrains.lesson_e.hw;


public class Main {

    public static void main(String[] args) {
        Horse h = new Horse("Orlik", "black", 5, 3f, 1500,100);
        Dog d = new Dog("Sharik", "ginger", 2, 0.5f, 500,10);
        Bird b = new Bird("Kar-karych", "gray", 1, 0.2f, 5);
        Cat c = new Cat("Chizhik", "dark-gray", 3, 2f, 200);

        Animal[] zoo = {h, d, b, c};
        for (Animal animal : zoo) {
            animal.jump();
            animal.run();
            animal.swim();
            System.out.println("--------------------------------------------------------");
        }
    }
}