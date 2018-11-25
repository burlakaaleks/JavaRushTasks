package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String numer1 = bufferedReader.readLine();
        String numer2 = bufferedReader.readLine();
        String numer3 = bufferedReader.readLine();

        int n1 = Integer.parseInt(numer1);
        int n2 = Integer.parseInt(numer2);
        int n3 = Integer.parseInt(numer3);

        int [] n = {n1, n2, n3};
        int result = 0;
        for (int i = 0; i<n.length; i++)
            if (n[i]>0)
                result++;
        System.out.println(result);

    }
}
