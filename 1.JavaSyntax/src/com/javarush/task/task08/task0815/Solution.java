package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();

        map.put("Мурлова","Козел");
        map.put("Волковав", "Даша");
        map.put("Волкова", "Мария");
        map.put("Денисов", "Вадим");
        map.put("Тимощук", "Алексей");
        map.put("Васильев", "Козел");
        map.put("Кварцева", "Даша");
        map.put("Руденко", "Алексей");
        map.put("Мурло", "Богдан");
        map.put("Власьева", "Мария");

        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int count = 0;
        for (String tmp : map.values()) {
            if (name.equals(tmp)) {
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int counter = 0;
        for (String tmp : map.keySet()) {
            if (lastName.equals(tmp)) {
                counter++;
            }
        }
        return counter;
    }


    public static void main(String[] args) {

    }
}
