package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] array = new int [5];

        for (int i = 0; i < 5 ; i++) {
        String number = reader.readLine();
        int n = Integer.parseInt(number);
        array [i]  = n;
        }

        Arrays.sort(array);

        for (int i = 0; i < 5 ; i++) {
            String result = String.valueOf(array[i]);
            System.out.println(result);
        }


    }
}
