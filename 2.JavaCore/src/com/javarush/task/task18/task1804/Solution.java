package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream input = new FileInputStream((new BufferedReader(new InputStreamReader(System.in))).readLine());

        int [] bytes = new int[256];
        while (input.available()>0){
            bytes[input.read()]++;
        }
        int min=1;
//        for (int i = 0; i < 256 ; i++) if (bytes[i] < min) min = bytes[i];
        for (int i = 0; i < bytes.length ; i++) {
            if(bytes[i]==min) System.out.print(i + " ");
        }
        input.close();
    }
}
