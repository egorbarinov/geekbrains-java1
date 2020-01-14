package ru.geekbrains.lesson01;

/**
 * Created by Egor Barinov on 13.01.2020.
 */
public class HomeWork01 {

    public static void main(String[] args) {

        //step 3
        //int  a = 3 , b = 2, c = 10, d = 2;
        //System.out.println(total(a, b, c, d));

        //step 4
        //int a = 8, b = 3;
        //valueBool(a, b);

        //step 5
        //int a = -2;
        //printPositiveOrNegative(a);

        //step 6
        //int a = -2;
        //System.out.println(isNegative(a));

        //step 7
        //String name = "Женя";
        //sayHello(name);

        //step 8
        //int year = 2020;
        //leapNotLeapYear(year);
    }

//    step 2
//    Создать переменные всех пройденных типов данных, и инициализировать их значения;

    static void value() {
        byte b = 110;
        short st = 13456;
        char ch = '*';
        int integer = 56;
        long lg = 145543L;
        float fl = 15.56f;
        double dl = 432.453;
        boolean bool = true;
        System.out.println(b + st);
    }

    //step 3
    //Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    // где a, b, c, d – входные параметры этого метода;
    public static int total(int a, int b, int c, int d) {

        return a * (b + (c / d));
    }

    //step 4
    //Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в
    // пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;

    public static void valueBool(int a, int b) {
        boolean bool = true;
        if (a + b >= 10 && a + b <= 20) {
            System.out.println(bool);
        } else {
            System.out.println(!bool);
        }

    }

    //step 5
    //Написать метод, которому в качестве параметра передается целое число, метод должен
    //напечатать в консоль положительное ли число передали, или отрицательное;
    //Замечание: ноль считаем положительным числом

    public static void printPositiveOrNegative(int num) {
        String text = "Число положительное";
        if (num < 0)
            text = "Число отрицательное";
        System.out.println(text);

    }

    //step 6
    //Написать метод, которому в качестве параметра передается целое число, метод должен
    //вернуть true, если число отрицательное;

    public static boolean isNegative(int num) {
        return num < 0;
    }

    //step 7
    //Написать метод, которому в качестве параметра передается строка, обозначающая имя,
    //метод должен вывести в консоль сообщение «Привет, указанное_имя!»;

    public static void sayHello(String name) {
        System.out.println("Привет, " + name);
    }

    //step 8
    //Написать метод, который определяет является ли год високосным, и выводит сообщение в
    //консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й –
    //високосный.

    public static void leapNotLeapYear(int year) {
        String text = " год високосный!";
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "\t" + text);
        }
        else {
            text = " год не високосный!";
            System.out.println(year + "\t" + text);
        }
    }
}

