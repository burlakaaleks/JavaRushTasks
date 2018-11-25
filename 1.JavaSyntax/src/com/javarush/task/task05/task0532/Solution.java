package com.javarush.task.task05.task0532;

import java.io.*;
import java.util.Arrays;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        if (n<=0)
            System.out.println("Введито число больше нуля!");
        int [] array = new int [n];
        for (int i = 0; i < n ; i++) {
            array [i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(array);
        System.out.println(array[n-1]);
    }
}
