package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
//        BufferedReader r = new BufferedReader( new InputStreamReader(System.in));

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String time = r.readLine();
        double t = Double.parseDouble(time);


        while (true){
            if (t<=5){
                if ((t>=0 && t<3) || t==5)
                    System.out.println("зелёный");
                else if (t>=3 && t<4)
                    System.out.println("желтый");
                else if (t>=4 && t<5)
                    System.out.println("красный");
                break;
            }
            t-=5;

        }
    }
}
