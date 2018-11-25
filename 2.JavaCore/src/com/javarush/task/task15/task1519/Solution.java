package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Double doubleResult;
        short shortResult;
        int integerResult;

        while(true){
            String read = reader.readLine();
            if (read.equals("exit")) break;

            if (read.contains(".")){
                try {
                    doubleResult = Double.parseDouble(read);
                    print(doubleResult);
                }
                catch (NumberFormatException e){
                    print(read);
                }

            }
            else {
                try {
                    Integer.parseInt(read);
                    if (Integer.parseInt(read)>0 && Integer.parseInt(read)<128 ){
                        shortResult = (short) Integer.parseInt(read);
                        print(shortResult);
                    }
                    else {
                        integerResult = Integer.parseInt(read);
                        print(integerResult);
                    }

                } catch (NumberFormatException e) {
                    print(read);
                }
            }

        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
