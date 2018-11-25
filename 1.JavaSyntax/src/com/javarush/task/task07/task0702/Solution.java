package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String [] srray = new String[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 8 ; i++) {
            String str = reader.readLine();
            srray[i] = str;
        }

        for (int i = 0; i < srray.length ; i++) {
            System.out.println(srray[9-i]);
        }
    }
}