package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream((new BufferedReader(new InputStreamReader(System.in))).readLine());

        int count = 0;
        int c;
        while(inputStream.available()>0){
            c=inputStream.read();
            if((char)c == 44){
                count++;
            }

        }
        System.out.println(count);
        inputStream.close();

    }
}
