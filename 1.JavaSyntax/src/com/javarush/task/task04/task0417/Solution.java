package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] array = new int[3];
        for (int i = 0; i < 3; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        if (array[0] == array[1] && array[0] == array[2]) {
                System.out.print(array[0] + " " + array[1] + " " + array[2]);
            }
        else {
            if (array[0] == array[2]) {
                System.out.print(array[0] + " " + array[2]);
            }
            if (array[1] == array[2]) {
                System.out.print(array[1] + " " + array[2]);
            }
            if (array[0] == array[1])
                System.out.println(array[0] + " " + array[1]);
        }
    }
}