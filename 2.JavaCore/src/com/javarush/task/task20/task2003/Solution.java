package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();
    public static Properties prop = new Properties();
    String fileInputName;

    public void fillInPropertiesMap() throws Exception {
        BufferedReader fileName = new BufferedReader(new InputStreamReader(System.in));
        fileInputName = fileName.readLine();
        fileName.close();

        FileInputStream inputStream = new FileInputStream(fileInputName);
        load(inputStream);
        inputStream.close();
    }

    public void save(OutputStream outputStream) throws Exception {
        prop.clear();
        for(Map.Entry <String,String> pair : properties.entrySet()){
            String key = pair.getKey();
            String value = pair.getValue();
            prop.put(key, value);
        }
        prop.store(outputStream,"");
    }

    public void load(InputStream inputStream) throws Exception {
        prop.load(inputStream);
        for (Map.Entry<Object, Object> pair: prop.entrySet()) {
            properties.put((String) pair.getKey(), (String) pair.getValue());
        }
    }

    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        solution.fillInPropertiesMap();

        FileOutputStream fileOutputStream = new FileOutputStream(solution.fileInputName);
        solution.save(fileOutputStream);
        fileOutputStream.close();
    }
}
