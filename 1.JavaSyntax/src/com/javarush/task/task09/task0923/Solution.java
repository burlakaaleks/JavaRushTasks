package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Character> notvovelslist = new ArrayList<>();
        String s = reader.readLine();
        char [] byletters = s.toCharArray();
        for (int i = 0; i < byletters.length ; i++) {
            if (isVowel(byletters[i])) {
                System.out.print(byletters[i] + " ");
            }
            else{
                if (byletters[i] != ' ') {
                    notvovelslist.add(byletters[i]);

                }
            }

        }
        System.out.println();
        for (int i = 0; i < notvovelslist.size() ; i++) {
            System.out.print(notvovelslist.get(i) + " ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}