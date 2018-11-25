package com.javarush.task.task13.task1318;

import java.io.*;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        InputStream fileInput = new FileInputStream(reader.readLine());

        while(fileInput.available()>0){
            System.out.print((char) fileInput.read());
        }
        reader.close();
        fileInput.close();
    }
}