package ru.geekbrains.homework02;

import java.util.Arrays;

public class HomeWork02 {

    static int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
    static int[] arr1 = new int [8];
    static int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    static int[] arr3 = {10, 6, 3, 14, 8, 40};
    static int[][] arr4 = new int[5][5];

    public static void main(String[] args) {

        arrZeroOne(arr); // задание 1
        plus3(arr1); // задание 2
        multiplytwo(arr2); //задание 3
        searchMin(arr3); // задание 4
        searchMax(arr3);
        integerArray(arr4); // выводит единицы, а не массив..


    }

    //1. Задать целочисленный массив, состоящий из элементов 0 и 1.
    // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Написать метод,
    // заменяющий в принятом массиве 0 на 1, 1 на 0;
    private static void arrZeroOne(int[] arr){
        //int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 1) ? 0 : 1; // если arr[i] == 1, то arr[i] = 0, иначе arr[i] = 1
        }
        System.out.println(Arrays.toString(arr)); //применил класс из урока, по другому пока не понимаю, как еще можно вывести..
    }

    //2. Задать пустой целочисленный массив размером 8. Написать метод, который c помощью
    // цикла заполнит его значениями 1 4 7 10 13 16 19 22;
    //    public static void arrLenght()
    private static void plus3(int[] arr) {
        //arr = new int[8];
        arr[0] = 1;
        for (int i = 1, x = 1; i < arr.length; i++) {
            arr[i] = x += 3;
        }
        System.out.println(Arrays.toString(arr));
    }

    //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод, принимающий на
    // вход массив и умножающий числа меньше 6 на 2;
    private static void multiplytwo(int[] arr) {
        //int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
        if (arr[i] < 6) {
            arr[i] = arr[i] * 2;
        }
    }
        System.out.println(Arrays.toString(arr2));
    }

    //4. Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;
    //минимальное значение
    private static void searchMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }

    //максимальное значение
    private static void searchMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }

    //5 * Создать квадратный целочисленный массив (количество строк и столбцов одинаковое),
    // заполнить его диагональные элементы единицами, используя цикл(ы);
    private static void integerArray(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j =  0; j < arr.length; j++) {
                arr[i][j] = 1;
                arr[arr.length - i - 1][j] = 1;
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
    }
}

















