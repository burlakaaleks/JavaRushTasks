package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();


        Scanner scanner = new Scanner(new FileInputStream(fileName));
        ArrayList<Integer> list = new ArrayList<>();


        while (scanner.hasNextLine()){
            list.add(scanner.nextInt());
        }

        Collections.sort(list);

        for (Integer abba : list){
            if (abba %2==0){
                System.out.println(abba);
            }
        }

        bufferedReader.close();
        scanner.close();
    }
}
