package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader filenameReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file1 = new BufferedReader(new FileReader(filenameReader.readLine()));
        BufferedReader file2 = new BufferedReader(new FileReader(filenameReader.readLine()));
        filenameReader.close();

        String line1;
        String line2;
        while ((line1 = file1.readLine())!= null){
            allLines.add(line1);
        }

        while ((line2 = file2.readLine())!=null){
            forRemoveLines.add(line2);
        }
        new Solution().joinData();

    }

    public void joinData () throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)){
            allLines.removeAll(forRemoveLines);
        }
        else{
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
