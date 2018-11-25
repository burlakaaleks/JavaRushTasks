package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        int shortest = 0;
        int longest = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(shortest).length() < list.get(i).length()) {
                shortest = i;
            }
            if (list.get(longest).length() > list.get(i).length()) {
                longest = i;
            }
        }
        if (shortest < longest)
            System.out.println(list.get(shortest));
        else
            System.out.println(list.get(longest));
    }
}
