package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        HashMap<String, String> map = new HashMap<>();

        map.put("Мурло","Козел");
        map.put("Волкова", "Даша");
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

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
