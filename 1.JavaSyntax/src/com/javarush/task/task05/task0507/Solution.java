package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double middle = 0.0;
        double i = 0;

        while (true){
            double s = sc.nextDouble();
            if (s == -1){
                break;
            }
            i++;
            middle += s;

        }
        middle /= i;
        System.out.println(middle);
    }
}

