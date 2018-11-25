package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    int [] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    public static void main(String[] args) {

        int i = 1;
        while (i<=10){
            int j=1;
                    while(j<=10){
                        System.out.print(i*j + " ");
                        j++;
                    }
            System.out.println();
            i++;
        }
    }
}
