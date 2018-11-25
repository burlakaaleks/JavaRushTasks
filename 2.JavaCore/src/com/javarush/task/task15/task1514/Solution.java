package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static{
        labels.put(0.333, "asdf");
        labels.put(3.14, "pi");
        labels.put(323.0, "sdfs");
        labels.put(12.2, "sdf");
        labels.put(23.3, "sdsf");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
