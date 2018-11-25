package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String m0 = r.readLine();
        String n0 = r.readLine();

        int m = Integer.parseInt(m0);
        int n = Integer.parseInt(n0);

        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n ; j++) {
                System.out.print(8);
            }
            System.out.println();
        }

    }
}
