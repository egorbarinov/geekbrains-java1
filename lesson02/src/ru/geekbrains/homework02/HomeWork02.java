package ru.geekbrains.homework02;

import java.util.Arrays;

public class HomeWork02 {

    //1
    private static void arrZeroOne(int[] arr) {
        //int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 1) ? 0 : 1; // если arr[i] == 1, то arr[i] = 0, иначе arr[i] = 1
        }
    }
    //2
    private static void plus3(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3 + 1;
        }
    }
    //3.
    private static void multiplytwo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
    }
    //4
    private static int searchMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    //максимальное значение
    private static int searchMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    //5
    private static void integerArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {  // первый цикл это ось Y, идет прозодит сверзу вниз
            for (int j = 0; j < arr[i].length; j++) {  // второй цикл это ось X, идет слева направо,
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static void diagonalInt(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - i - 1] = 1; // запомнить, коли не понимаешь
        }
    }
    //6
    private static boolean checkBalance(int[] arr) {
        int left = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int right = 0;
            left += arr[i];
            for (int j = i + 1; j < arr.length; j++) {  //запомнить, коли не понимаешь
                right += arr[j];
            }
            if (left == right) {
                return true;
            }
        }
        return false;
    }
    // 7
    private static void shifter(int[] arr, int value) {
        boolean dir = value < 0;
        if (dir) value = -value;

        value %= arr.length; // value = value % arr.length
//        value = 2 % 6;

        int lastIndex = arr.length - 1;
        for (int i = 0; i < value; i++) {
            int temp = (dir) ? arr[0] : arr[lastIndex];
            for (int j = 0; j < lastIndex; j++) {
                if (dir) {
                    arr[j] = arr[j + 1];
                } else {
                    arr[lastIndex - j] = arr[lastIndex - j - 1];
                }
            }
            if (dir) {
                arr[lastIndex] = temp;
            } else {
                arr[0] = temp;
            }
        }
    }
    public static void main(String[] args) {

        //1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Написать метод,
        // заменяющий в принятом массиве 0 на 1, 1 на 0;
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr));
        arrZeroOne(arr);
        System.out.println(Arrays.toString(arr));

        //2. Задать пустой целочисленный массив размером 8. Написать метод, который c помощью
        // цикла заполнит его значениями 1 4 7 10 13 16 19 22;
        //    public static void arrLenght()
        int[] arr1 = new int[8];
        plus3(arr1);
        System.out.println(Arrays.toString(arr1));

        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод, принимающий на
        // вход массив и умножающий числа меньше 6 на 2;
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplytwo(arr2);
        System.out.println(Arrays.toString(arr2));

        //4. Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;
        //минимальное значение
        int[] arr3 = {10, 6, 3, 14, 8, 40};
        System.out.println(searchMin(arr3));
        System.out.println(searchMax(arr3));

        //5 * Создать квадратный целочисленный массив (количество строк и столбцов одинаковое),
        // заполнить его диагональные элементы единицами, используя цикл(ы);
        int[][] arr4 = new int[5][5];
        diagonalInt(arr4);
        integerArray(arr4);

        //6 ** Написать метод, в который передается не пустой одномерный
        // целочисленный массив, метод должен вернуть true если в массиве
        // есть место, в котором сумма левой и правой части массива равны.
        // Примеры: checkBalance([1, 1, 1, || 2, 1]) → true,
        // checkBalance ([2, 1, 1, 2, 1]) → false,
        // checkBalance ([10, || 1, 2, 3, 4]) → true. Абстрактная граница показана
        // символами ||, эти символы в массив не входят.
        int[] arr5 = {1, 1, 1, 2, 1};
        System.out.println(checkBalance(arr5));
        int[] arr6 = {2, 1, 1, 2, 1};
        System.out.println(checkBalance(arr6));

        // 7 *** Написать метод, которому на вход подаётся одномерный массив
        // и число n (может быть положительным, или отрицательным), при этом
        // метод должен циклически сместить все элементы массива на n позиций.
        // **** Не пользоваться вспомогательным массивом.
        int[] ar4 = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(ar4));
        shifter(ar4, 2);
        System.out.println(Arrays.toString(ar4));
        shifter(ar4, -10);
        System.out.println(Arrays.toString(ar4));

    }
}

















