package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char [] word = s.toCharArray();

        for (int i = 0; i < word.length; i++) {
            char ss = Character.toUpperCase(word[0]);
            word[0] = ss;
            if(Character.isSpaceChar(word[i])) {
                word[i + 1] = Character.toUpperCase(word[i + 1]);
            }
        }

        for (int i = 0; i < word.length ; i++) {
            System.out.print(word[i]);
        }

    }
}
