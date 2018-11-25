package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int [] srray = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < srray.length ; i++) {
            String str = reader.readLine();
            int num = Integer.parseInt(str);
            srray[i] = num;
        }

        for (int i = 0; i < srray.length ; i++) {
            System.out.println(srray[9-i]);
        }
    }
}

