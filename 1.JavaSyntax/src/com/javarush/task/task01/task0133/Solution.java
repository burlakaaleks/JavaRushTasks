package com.javarush.task.task01.task0133;

/* 
Не думать о секундах…
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getCountSecondsPassedInCurrentHour(12345));
    }

    public static int getCountSecondsPassedInCurrentHour(int seconds) {
        double secondInHour = seconds/60/60;
        int hours = (int)Math.floor(secondInHour);
        int result = seconds - hours*60*60;
        return result;
    }
}