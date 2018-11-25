package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> global = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            global.add(Integer.parseInt(reader.readLine()));
        }

        ArrayList<Integer> divByThree = new ArrayList<Integer>();
        ArrayList<Integer> divByTwo = new ArrayList<Integer>();
        ArrayList<Integer> others = new ArrayList<Integer>();

        for (int i = 0; i < global.size(); i++) {
            Integer x = global.get(i);

            if (x %3 == 0)
                divByThree.add(x);
            if (x %2 == 0)
                divByTwo.add(x);
            if (x %2 !=0 && x%3 != 0)
                others.add(x);
        }

        printList(divByThree);
        printList(divByTwo);
        printList(others);


    }

    public static void printList(List<Integer> list) {
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }
//        System.out.println("==========");
    }
}
