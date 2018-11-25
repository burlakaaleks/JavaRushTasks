package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int [] bigArray = new int[20];
        int [] smallArray = new int[10];
        int [] littleArray = new int [10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < bigArray.length; i++) {
            bigArray[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < bigArray.length/2 ; i++) {
            smallArray[i] = bigArray[i];
        }
        for (int i = 10; i < bigArray.length; i++){
            littleArray[i-10] = bigArray[i];
        }
        for (int i = 0; i < littleArray.length ; i++) {
            System.out.println(littleArray[i]);
        }
    }
}
