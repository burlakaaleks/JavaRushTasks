package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[3];

        for (int i = 0; i < 3; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);

        System.out.println(a[1]);
    }
}
