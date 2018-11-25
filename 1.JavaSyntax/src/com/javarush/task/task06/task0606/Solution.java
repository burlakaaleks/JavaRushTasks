package com.javarush.task.task06.task0606;

import java.io.*;
import java.util.Scanner;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        int n = Integer.parseInt(number);

        for (int i = 0; i < number.length() ; i++) {
            if (n %2 == 0){ even++; }
            else {odd++;}

            n/=10;
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
