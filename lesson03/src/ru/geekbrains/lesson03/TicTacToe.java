package ru.geekbrains.lesson03;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = 'O';
    private static final char DOT_EMPTY = '.';
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();
    //private static int fieldSizeX;
    //private static int fieldSizeY;
    private static int Size;
    private static char[][] field;

    //инициализируем поле
    private static void initField() {
        Size = 5;

        field = new char[Size][Size];
        for (int i = 0; i < Size; i++) {
            for (int j = 0; j < Size; j++) {
                field[i][j] = DOT_EMPTY;
            }
        }
    }

    //печать поля
    private static void printField() {
        for (int i = 0; i < Size; i++) {
            System.out.print("|");
            for (int j = 0; j < Size; j++) {
                System.out.print(field[i][j] + "|"); // рисуем красивое поле
            }
            System.out.println();

        }
    }

    //ход игрока
    private static void humanTurn() {
        int x;
        int y;
        do {
            System.out.println("Enter coordinates (x, y) от 1 до 5");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isCellValid(x, y) || !isCellEmpty(x, y));
        field[y][x] = DOT_HUMAN;
    }

    // проверка на верность координать хода игрока, попадают ли в поле или нет
    private static boolean isCellValid(int x, int y) {
        return x >= 0 && x < Size && y >= 0 && y < Size;
    }

    // проверка на наличие свободного места в поле
    private static boolean isCellEmpty(int x, int y) {
        return field[y][x] == DOT_EMPTY;       // метод проверяет, если свободные места, если есть возвращает true
    }

    //ход компьютера
    private static void aiTurn() {
        int x;
        int y;
        do {
            x = RANDOM.nextInt(Size);
            y = RANDOM.nextInt(Size);
        } while (!isCellEmpty(x, y));
        field[y][x] = DOT_AI;
    }

    //проверка на ничью
    private static boolean isDraw() {
        for (int y = 0; y < Size; y++) {
            for (int x = 0; x < Size; x++) {
                if (field[y][x] == DOT_EMPTY) {  //если еще есть свободные клетки, ввохвращаем false
                    return false;
                }
            }
        }
        return true;
    }

    // проверка на победу
    private static boolean checkWin(char c) {
        // метод короче, чем на уроке, но не идеальный. работает корректно для поля 3 на 3
//        if (field[y][0] == c && field[y][1] == c && field[y][2] == c || field[0][x] == c && field[1][x] == c && field[2][x] == c)
//            return true;
//        if (field[0][0] == c && field[1][1] == c && field[2][2] ==c || field[0][2] == c && field[1][1] == c && field[2][0] ==c )
//            return true;
        //метод для масштабируемого поля
        // PS метод работает не совсем корректно. если проверяем на 4 попадания в ряд X, например, по горизонтали,
        // то в случае рандомного нахождения четырех X (не в ряд) на этой горизонтали
        // все-равно автоматически засчитывается победа..
        int diagonal1, diagonal2, horisontal, vertical;
        for (int y = 0; y < Size; y++) {
            horisontal = 0;
            vertical = 0;
            for (int x = 0; x < Size; x++) {
                if (field[y][x] == c) {
                    horisontal++;
                }
                if (field[x][y] == c) {
                    vertical++;
                }
            }
            if (horisontal == 4 || vertical == 4) { //вместо значения 4 можно присвоить значение переменной Size
                return true;
            }
        }
        diagonal1 = 0; diagonal2 = 0;
        for (int i = 0; i < Size; i++) {
            if (field[i][i] == c) {
                diagonal1++;
            }
            if (field[i][Size - i - 1] == c) {
                diagonal2++;
            }
        }
        if (diagonal1 == 4 || diagonal2 == 4) {
            return true;
        }
        return false;
    }

    public static void main (String[]args){
        initField();
        printField();
        while (true) {
            humanTurn();
            printField();
            if (checkWin(DOT_HUMAN)) {
                System.out.println("Human win!");
                break;
            }
            if (isDraw()) {
                System.out.println("Draw!");
                break;
            }
            aiTurn();
            printField();
            if (checkWin(DOT_AI)) {
                System.out.println("Computer win!");
                break;
            }
            if (isDraw()) {
                System.out.println("Draw!");
                break;
            }
        }
    }
}
