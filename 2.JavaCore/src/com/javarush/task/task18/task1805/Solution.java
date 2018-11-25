package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream input = new FileInputStream((new BufferedReader(new InputStreamReader(System.in))).readLine());

        int [] bytes = new int[256];
        while (input.available()>0){
            bytes[input.read()]++;
        }
        for (int i = 0; i < bytes.length ; i++) {
            if (bytes[i]!=0) System.out.print(i + " ");
        }
        input.close();
    }
}
