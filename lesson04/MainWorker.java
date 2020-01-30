package ru.geekbrains.lesson_d.hw;

import ru.geekbrains.lesson_d.home.Employee;

public class MainWorker {

    // 6.	* Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.
    // Метод должен принимать в качестве параметра массив сотрудников.
    // Вывести в main() возраст и зарплату сотрудника до и после вызова метода;

    private static void increaser(Worker[] emp, byte age, float increment){ // аргументы здесь: массив сотрудников, возраст, сумма
        for (int i = 0; i < emp.length; i++) {
            if (emp[i].getAge() > age) {  // находим сотрудников
                emp[i].setSalary(increment); //используем метод для повышения з/п на величину инкремент
                emp[i].isSalaryChanged = true; //boolean изменения з/п ставим истину
            }
        }
    }

    // 7.	** Написать методы (принимающие на вход массив сотрудников),
    // вычисляющие средний возраст и среднюю зарплату сотрудников,
    // вывести результаты работы в консоль.

    private static float averageAge(Worker[] work){
        float result = 0;
        for (int i = 0; i < work.length; i++)
            result += work[i].getAge();

        return result / work.length;
    }


    private static float averageSalary(Worker[] work){
        float result = 0;
        for (int i = 0; i < work.length; i++)
            result += work[i].getSalary();

        return result / work.length;  // возвращаем среднюю заработную плату
    }



    public static void main(String[] args) {

        // 1.	Создать класс "Сотрудник" с полями: ФИО, должность, телефон,
        // зарплата, возраст;

        Worker w = new Worker("Egor", "Vyacheslavovich",
                "Barinov", "7(495)555-55-55", "Developer", 60000, 1982);

        // 4. Вывести при помощи методов из пункта 3 ФИО и должность.
        System.out.println("Данные на работника "+w.getPosition()+", "+
        w.getName()+" "+w.getSecondName()+" "+w.getSurname()+".");

        // 5. Создать массив из 5 сотрудников. С помощью цикла вывести
        // информацию только о сотрудниках старше 40 лет;

        Worker[] workers = {
                w,
                new Worker("Evgeniy", "Viktorovich",
                        "Sidorov", "7(495)122-33-44",
                        "technik", 60000, 1982),
                new Worker("Roman", "Sergeevich",
                        "Dudakov", "7(495)233-44-55",
                        "technik", 60000, 1979),
                new Worker("Margarita", "Anatolievna",
                        "Fedorova", "7(495)255-44-55",
                        "manager", 50000, 1980),
                new Worker("Petr", "Sergeevich",
                        "Boyakovsky", "7(495)155-44-66",
                        "manager", 50000, 1970),
        };

        // выводим лица, старше 40 лет на публичное обозрение
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getAge() > 40) {
                System.out.println(workers[i].getFullInfo());
            }
        }

        //выводим массив из сотрудников в консоль
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < workers.length; i++)
            System.out.println(workers[i].getFullInfo());

        // Задание 6 Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.
        increaser(workers, (byte)45, 5000.0f);

        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < workers.length; i++)
            if (workers[i].isSalaryChanged)
                System.out.println(workers[i].getFullInfo());
        System.out.println("--------------------------------------------------------");
        System.out.println("Avg. age: " + averageAge(workers) + " years");
        System.out.println("Avg. salary: " + averageSalary(workers) + " RUR");
    }

}