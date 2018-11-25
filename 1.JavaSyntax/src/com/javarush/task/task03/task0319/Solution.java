package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name = bufferedReader.readLine();
        String chislo1 = bufferedReader.readLine();
        int number1 = Integer.parseInt(chislo1);
        String chislo2 = bufferedReader.readLine();
        int numder2 = Integer.parseInt(chislo2);

        System.out.println(name + " получает " + number1 + " через " + numder2 + " лет.");
    }
}
