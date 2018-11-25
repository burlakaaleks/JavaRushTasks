package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String num1 = bufferedReader.readLine();
        String num2 = bufferedReader.readLine();
        String num3 = bufferedReader.readLine();
        String num4 = bufferedReader.readLine();

        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int n3 = Integer.parseInt(num3);
        int n4 = Integer.parseInt(num4);

        int maxFrom12 = 0;
        int maxFrom34 = 0;
        int result = 0;

        maxFrom12 = maxNumber(n1, n2);
        maxFrom34 = maxNumber(n3, n4);

        result = maxNumber(maxFrom12, maxFrom34);

        System.out.println(result);

    }

    public static int maxNumber (int a, int b) {
        if (a>b)
            return a;
        else if (b>a)
            return b;
        else
            return a;
    }
}
