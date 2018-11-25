package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader filePath = new BufferedReader(new InputStreamReader(System.in));
        String fileInName = filePath.readLine();
        String fileOutName = filePath.readLine();
        filePath.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileInName));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileOutName));

        while(fileReader.ready()){
            String line = fileReader.readLine();
            fileWriter.write(line.replaceAll("[\\p{Punct}\\n]",""));
        }
        fileWriter.close();
        fileReader.close();
    }
}
