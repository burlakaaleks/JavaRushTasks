package com.javarush.task.task08.task0814;

import java.util.*;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 3; i <23 ; i++) {
            set.add(i);
        }
        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        Collection<Integer> llist = new LinkedList<>();

        for (Integer element : set){
            if (element>10)
                llist.add(element);
        }
        set.removeAll(llist);
        return set;
    }

    public static void main(String[] args) {

    }
}
