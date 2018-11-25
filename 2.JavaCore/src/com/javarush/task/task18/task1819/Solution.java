package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try{
            String file1path = reader.readLine();
            String file2path = reader.readLine();
            reader.close();

            FileInputStream fileIn = new FileInputStream(file1path);
            FileInputStream file2 = new FileInputStream(file2path);


            ArrayList<Integer> list = new ArrayList<>();

            while(file2.available()>0) {
                list.add(file2.read());
            }

            while(fileIn.available()>0) {
                list.add(fileIn.read());
            }

            FileOutputStream fileOut = new FileOutputStream(file1path);
            for(int i : list){
                fileOut.write(i);
            }


            fileOut.flush();
            fileIn.close();
            file2.close();
            fileOut.close();

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
