package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String numb1 = bufferedReader.readLine();
        String numb2 = bufferedReader.readLine();
        String numb3 = bufferedReader.readLine();

        int a = Integer.parseInt(numb1);
        int b = Integer.parseInt(numb2);
        int c = Integer.parseInt(numb3);


        if (a+b>c && a+c>b && b+c>a)
            System.out.println("Треугольник существует.");
        else
            System.out.println("Треугольник не существует.");
    }
}