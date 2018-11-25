package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
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
        int plusresult = 0 , minusresult = 0;

        for (int i = 0; i<n.length; i++)
            if (n[i]>0)
                plusresult++;
            else if (n[i]<0)
                minusresult++;

        System.out.println("количество отрицательных чисел: " + minusresult);
        System.out.println("количество положительных чисел: " + plusresult);

    }
}
