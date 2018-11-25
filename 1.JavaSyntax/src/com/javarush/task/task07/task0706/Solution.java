package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int [] irray = new int[15];
        int domchet = 0;
        int domnechet = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < irray.length ; i++) {
            int n = Integer.parseInt(reader.readLine());
            irray[i] = n;
        }
        for (int i = 0; i < irray.length; i+=2) {
            domchet += irray[i];
        }
        for (int i = 1; i < irray.length ; i+=2) {
            domnechet += irray[i];
        }

        if (domchet>domnechet)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}