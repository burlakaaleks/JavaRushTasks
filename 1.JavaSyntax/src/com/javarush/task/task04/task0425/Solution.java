package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String shirota = bufferedReader.readLine();
        String dolgota = bufferedReader.readLine();

        int x = Integer.parseInt(shirota);
        int y = Integer.parseInt(dolgota);

        if (x>0 && y>0)
            System.out.println(1);
        else if (x<0 && y>0)
            System.out.println(2);
        else if (x<0 && y<0)
            System.out.println(3);
        else if (x>0 && y<0)
            System.out.println(4);
    }
}
