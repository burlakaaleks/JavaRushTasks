package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader fileInput = new BufferedReader(new InputStreamReader(System.in));
        String fileName = fileInput.readLine();
        fileInput.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));

        int counter = 0;
        String word = "world";

        while (fileReader.ready()){
            String line = fileReader.readLine();
            String[] read = line.toString().split("\\W");

            for(String s : read){
                if(s.equals(word))
                    counter++;
            }
        }
        fileReader.close();
        System.out.println(counter);

    }
}
