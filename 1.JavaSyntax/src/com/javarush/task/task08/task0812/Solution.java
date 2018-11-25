package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10 ; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        int max = 1;
        int finale = 0;
        for (int i = 1; i < list.size() ; i++) {
            if (list.get(i) != list.get(i-1)){
                max = 1;
            }
            else if (list.get(i) == list.get(i-1)) {
                max++;
            }

            if (finale <= max)
                finale = max;
        }
        System.out.println(finale);
    }
}