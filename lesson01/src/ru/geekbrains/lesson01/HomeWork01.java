package ru.geekbrains.lesson01;

import org.w3c.dom.ls.LSOutput;

public class HomeWork01 {

    public static void main(String[] args) {

        value();
        System.out.println(total(2, 3, 10, 5));  // a * (b + (c / d))
        System.out.println(valueBool(8, 3));
        printPositiveOrNegative(2);
        System.out.println("Your number is " + ((printPositiveOrNegative(-5)) ? "isPositive" : "isnegative"));
        System.out.println(isNegative(-5));
        System.out.println(sayHello("Иван"));
        System.out.println("Год високосный? " + leapNotLeapYear(2020));
    }

//    step 2
//    Создать переменные всех пройденных типов данных, и инициализировать их значения;

    public static void value() {
        byte b = 110;
        short st = 13456;
        char ch = 't';
        char ch0 = 123;
        int integer = 56;
        long lg = 145543L;
        float fl = 15.56f;
        double dl = 432.453;
        boolean bool = true;
        System.out.println((int)ch);
        System.out.println(ch0);
        System.out.println("Год високосный? " + leapNotLeapYear(2020));
    }

    //step 3
    //Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    // где a, b, c, d – входные параметры этого метода;
    public static float total(int a, int b, int c, int d) {
        return a * (b + (c * 1f / d));
    }

    //step 4
    //Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в
    // пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;

    public static boolean valueBool(int a, int b) {
        int sum = a + b;
        return (sum >= 10 && sum <= 20);
    }

    //step 5
    //Написать метод, которому в качестве параметра передается целое число, метод должен
    //напечатать в консоль, положительное ли число передали или отрицательное. Замечание:
    //ноль считаем положительным числом.

    public static boolean printPositiveOrNegative(int num) {
       return num >= 0;
    }

    //step 6
    //Написать метод, которому в качестве параметра передается целое число. Метод должен
    //вернуть true, если число отрицательное.
        public static boolean isNegative(int num) {
        return num < 0;
    }

    //step 7
    /*
     * Написать метод, которому в качестве параметра передаётся строка,
     * обозначающая имя, метод должен вывести в консоль сообщение "Привет, указанное_имя!"
     */
    public static String sayHello(String name) {
        return "Привет, " + name + "!";
    }

    //step 8
    //Написать метод, который определяет, является ли год високосным, и выводит сообщение в
    //консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й –
    //високосный

    public static boolean leapNotLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }
}

