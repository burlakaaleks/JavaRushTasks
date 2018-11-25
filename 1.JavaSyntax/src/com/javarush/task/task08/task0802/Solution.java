package com.javarush.task.task08.task0802;

/* 
HashMap из 10 пар
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("арбуз","ягода");
        hashMap.put("банан","трава");
        hashMap.put("вишня","ягода");
        hashMap.put("груша","фрукт");
        hashMap.put("дыня","овощ");
        hashMap.put("ежевика","куст");
        hashMap.put("жень-шень", "корень");
        hashMap.put("земляника","ягода");
        hashMap.put("ирис","цветок");
        hashMap.put("картофель","клубень");

        Iterator<Map.Entry<String, String>> iterator = hashMap.entrySet().iterator();

        while (iterator.hasNext())
        {
            HashMap.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }

    }
}
