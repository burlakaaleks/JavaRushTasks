package com.javarush.task.task22.task2203;

/* 
Между табуляциями
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        if(string == null || string.isEmpty()) throw new TooShortStringException();

        String res;
        try{
        int index = string.indexOf("\t")+1;
        res = string.substring(index, string.indexOf("\t",index));
        }catch (StringIndexOutOfBoundsException e){
            throw new TooShortStringException();
        }
        return res;
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}
