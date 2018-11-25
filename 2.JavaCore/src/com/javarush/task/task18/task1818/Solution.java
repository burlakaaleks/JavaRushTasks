package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try{
        FileOutputStream file1 = new FileOutputStream(reader.readLine());

        FileInputStream file2 = new FileInputStream(reader.readLine());
        FileInputStream file3 = new FileInputStream(reader.readLine());



        while(file2.available()>0){
            byte[] buffer = new byte[file2.available()];
            file2.read(buffer, 0, buffer.length);
            file1.write(buffer, 0, buffer.length);
        }
        while(file3.available()>0){
            byte[] buffer = new byte[file3.available()];
            file3.read(buffer, 0, buffer.length);
            file1.write(buffer, file2.available(), buffer.length);
        }

        file1.flush();
        file1.close();
        file2.close();
        file3.close();

        }catch (IOException e){ System.out.println(e.getMessage()); }
    }
}
