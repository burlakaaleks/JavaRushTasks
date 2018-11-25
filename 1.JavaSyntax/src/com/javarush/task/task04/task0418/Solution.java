package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String numb1 = bufferedReader.readLine();
        String numb2 = bufferedReader.readLine();

        int a = Integer.parseInt(numb1);
        int b = Integer.parseInt(numb2);

        if (a<b)
            System.out.println(a);
        else if (a>b)
            System.out.println(b);
        else
            System.out.println(a);
    }
}