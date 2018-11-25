package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int [] irray = new int[10];
        String [] srray = new String[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < srray.length; i++) {
            srray[i] = reader.readLine();
            irray[i] = srray[i].length();
        }

        for (int i = 0; i < irray.length ; i++) {
            System.out.println(irray[i]);
        }
    }
}

