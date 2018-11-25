package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String olddate = reader.readLine();

        SimpleDateFormat old = new SimpleDateFormat("MM/dd/yyyy", Locale.getDefault());
        SimpleDateFormat newdate = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);

        Date date = old.parse(olddate);
        String result = newdate.format(date).toUpperCase();

        System.out.println(result);
    }
}