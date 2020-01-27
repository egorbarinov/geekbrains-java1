package ru.geekbrains.lesson_d.hw;

import ru.geekbrains.lesson_d.hw.working_package.Worker;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Worker[] workers = new Worker[5];

        workers[0] = new Worker("Barinov Egor Vyacheslavovich", "manager", "74955555555", 100000, 37);
        workers[1] = new Worker("Sidorov Evgeniy Viktorovich", "manager", "74951223344", 100000, 42);
        workers[2] = new Worker("Dudakov Roman Sergeevich", "manager", "74952334455", 100000, 46);
        workers[3] = new Worker("Fedorova Margarita Anatolievna", "manager", "74952554455", 100000, 42);
        workers[4] = new Worker("Boyakovsky Petr Sergeevich", "manager", "74951554466", 100000, 47);



        // выводим лица, старше 40 лет на публичное обозрение
        fullNameOrPost(workers);
        // Задание 6 Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000. Не справился. Не знаю что не так в методе.....
        //salaryPlus(workers);

    }

    public static void fullNameOrPost(Worker[] workers) {
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getAge() > 40) {
                workers[i].outputPull();
            }
        }
    }
//    public static void salaryPlus(Worker[] workers) {
//
//        for (int i = 0; i < workers.length; i++) {
//            int salary = workers[i].getSalary();
//            if (workers[i].getAge() > 45) {
//                salary = salary + 5000;
//            }
//            workers[i].outputPull();
//        }
//    }

}

