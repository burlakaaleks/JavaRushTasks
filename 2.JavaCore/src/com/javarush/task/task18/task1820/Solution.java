package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try{
            String fileIn = reader.readLine();
            String fileOut = reader.readLine();
            reader.close();

            BufferedReader input = new BufferedReader(new FileReader(fileIn));
            BufferedWriter output = new BufferedWriter(new FileWriter(fileOut));

            ArrayList<String> list = new ArrayList<String>();
            while(input.ready()){
                list.add(input.readLine());
            }
            input.close();

            ArrayList<Long> values = new ArrayList<Long>();
            for(String s : list){
                for(String part : s.split(" ")) {
                    double a = Double.parseDouble(part);
                    values.add(Math.round(a));
                }
            }

            for(Long value : values){
                output.write(value.toString()+" ");
            }
            output.close();

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
