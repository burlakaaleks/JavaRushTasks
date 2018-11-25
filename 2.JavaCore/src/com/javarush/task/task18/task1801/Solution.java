package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception, IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream input = new FileInputStream(reader.readLine());

        int maxByte = input.read();
        while (input.available()>0){
            int data = input.read();

            if(data>maxByte)
                maxByte = data;
        }
        System.out.println(maxByte);
        input.close();

    }
}
