package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String pathOfFolder = "";
        try {
            pathOfFolder = bufferedReader.readLine();
        } catch (IOException e) {
        }

        FileOutputStream fileOutputStream = new FileOutputStream(pathOfFolder);
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, "UTF-8"));

        ArrayList<String> txt = new ArrayList<>();
        int i = 0;
        while (true) {
                try {
                    txt.add(bufferedReader.readLine());
                    if (txt.get(i).equals("exit")) break;
                } catch (IOException e) { }
            i++;
        }

        try {
            for (int j = 0; j < txt.size() ; j++) {
                bufferedWriter.append(txt.get(j));
                bufferedWriter.append("\n");
                bufferedWriter.flush();
            }
        } catch (IOException e) {
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
            }
            try {
                fileOutputStream.close();
            } catch (IOException e) {
            }
            try {
                bufferedReader.close();
            } catch (IOException e) {
            }


        }
    }
}
