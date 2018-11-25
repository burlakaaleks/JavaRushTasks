package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Иванов1", 600);
        hashMap.put("Иванов2", 300);
        hashMap.put("Иванов3", 400);
        hashMap.put("Иванов4", 1600);
        hashMap.put("Иванов5", 1000);
        hashMap.put("Иванов6", 200);
        hashMap.put("Иванов7", 450);
        hashMap.put("Иванов8", 2000);
        hashMap.put("Иванов9", 210);
        hashMap.put("Иванов10", 390);

//        removeItemFromMap(hashMap);

        return hashMap;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> mapCopy = new HashMap<>(map);
        for (Map.Entry<String, Integer> pair : mapCopy.entrySet()){
            if (pair.getValue()<500){
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}