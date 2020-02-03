package ru.geekbrains.lesson_f.hw;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void newFile (String fileName, String text) throws FileNotFoundException {

            PrintStream ps = new PrintStream(fileName);
            ps.println(text);
            ps.close();
//            Scanner sc = new Scanner(new FileInputStream(fileName));
//            while (sc.hasNext()) {
//                System.out.println(sc.nextLine());
//            }
    }

    public static String newRandomText ( int len) {
        String symbChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder();

        while (sb.length() < len) {
            int index = (int) (rnd.nextFloat() * symbChars.length());
            sb.append(symbChars.charAt(index));
        }
        return sb.toString();
    }

    public static void twoInOneFile(String[] names, String outputFileName) throws IOException {
        FileOutputStream fos = new FileOutputStream(outputFileName);
        for (String name: names){
            FileInputStream fis = new FileInputStream(name);
            int i;
            do {
                i = fis.read();
                if(i != -1){
                    fos.write(i);
                }
            }while (i != -1);
        }
    }

    public static void main(String[] args) throws IOException {

        //1. Создать 2 текстовых файла, примерно по 50-100 символов в каждом(особого значения не имеет);
        newFile("test.txt", newRandomText(50));
        FileInputStream fis = new FileInputStream("test.txt");              // чтение побайтно!!! читает данные из файла побайтно и выводит  на  консоль
        int b;
        while ((b = fis.read()) != -1) {
            System.out.print((char) b);
        }
        newFile("test2.txt", newRandomText(50));
        Scanner sc = new Scanner(new FileInputStream("test2.txt"));   //используем Scanner класса FileInputStream для вывода в консоль
        while (sc.hasNext()) {
            System.out.println(sc.nextLine());
        }


        //2. Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла,
        // потом текст из второго.
        twoInOneFile(new String[]{"test.txt", "test2.txt"}, "Second_test.txt");
        Scanner sc2 = new Scanner(new FileInputStream("Second_test.txt"));   //используем Scanner класса FileInputStream для вывода в консоль
        while (sc2.hasNext()) {
            System.out.println(sc2.nextLine());
        }

        //3. Написать программу, которая проверяет присутствует ли указанное
        // пользователем слово в файле (работаем только с латиницей).
        PrintStream ps = new PrintStream("novella.txt");
        ps.println("Two men, who are in the country for holidays,\n" +
                "are walking in an orchard. They see that there\n" +
                "are a lot of apples on all trees. Only on one tree\n" +
                "there are no apples at all. A small country\n" +
                "boy is sitting near that tree. They call him:\n" +
                "“Come here, boy. Do you know why there are no apples\n" +
                "on this tree?” “Of course I do,” answers the boy,\n" +
                "“because it’s an oak-tree.”");
        ps.close();

        Scanner sc3 = new Scanner(new FileInputStream("Second_test.txt"));   //используем Scanner класса FileInputStream для вывода в консоль
        while (sc3.hasNext()) {

           //

        }
    }

}
