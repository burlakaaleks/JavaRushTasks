package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(100, 25.5));
        System.out.println(convertEurToUsd(20, 40.9));
    }

    public static double convertEurToUsd(int eur, double course) {
        double result = eur*course;
        return result;
    }
}
