package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String numb = bufferedReader.readLine();
        int a = Integer.parseInt(numb);

        if (a==0)
            System.out.println(a);
        else if (a<0) {
            a += 1;
            System.out.println(a);
        }
        else if (a>0) {
            a *= 2;
            System.out.println(a);
        }
    }

}