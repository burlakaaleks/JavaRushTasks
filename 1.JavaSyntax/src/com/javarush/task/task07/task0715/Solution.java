package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add(0,"мама");
        list.add(1,"мыла");
        list.add(2,"раму");

        for (int i = 1; i < 6; i+=2) {
            list.add(i,"именно");
        }

        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }
}
