package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        Scanner stringer = new Scanner(System.in);
        return stringer.nextLine();
    }

    public static int readInt() throws Exception {
        Scanner integer = new Scanner(System.in);
        return integer.nextInt();
    }

    public static double readDouble() throws Exception {
        Scanner doubler = new Scanner(System.in);
        return doubler.nextDouble();
    }

    public static boolean readBoolean() throws Exception {
        Scanner boleaner = new Scanner(System.in);
        return boleaner.hasNext("true");
    }

    public static void main(String[] args) {

    }
}
