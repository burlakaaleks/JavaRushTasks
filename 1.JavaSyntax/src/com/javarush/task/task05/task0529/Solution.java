package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String sum = "сумма";
        int result = 0;
        while (true){
            String numb = sc.nextLine();
            if (numb.equals(sum)) {
                break;
            }
            int n = Integer.parseInt(numb);
            result += n;
        }
        System.out.println(result);
    }
}
