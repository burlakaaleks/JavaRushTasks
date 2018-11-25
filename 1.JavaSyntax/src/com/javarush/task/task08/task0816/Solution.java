package com.javarush.task.task08.task0816;

import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("DiCaprio", new Date("JULY 5 1974"));
        map.put("Lambert", new Date("AUGUST 23 1997"));
        map.put("White", new Date("JUNE 6 1999"));
        map.put("Tucker", new Date("JANUARY 30 1983"));
        map.put("Proffit", new Date("MARCH 11 1990"));
        map.put("Webb", new Date("FEBRUARY 20 1992"));
        map.put("Richardson", new Date("APRIL 4 1976"));
        map.put("Stone", new Date("JULY 26 1989"));
        map.put("Yates", new Date("SEPTEMBER 5 1986"));
        return map;
        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {

        HashMap<String, Date> copy = new HashMap<String, Date>(map);
        for(HashMap.Entry<String , Date> pair : copy.entrySet()){
            if (pair.getValue().getMonth() > 4 && pair.getValue().getMonth()<8)
                map.remove(pair.getKey());
        }

    }

    public static void main(String[] args) {

    }
}
