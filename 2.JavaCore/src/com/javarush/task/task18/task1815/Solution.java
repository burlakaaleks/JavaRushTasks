package com.javarush.task.task18.task1815;

import java.util.List;

/* 
Таблица
*/

public class Solution {
    public class TableInterfaceWrapper implements ATableInterface  {

        ATableInterface table;

        public TableInterfaceWrapper(ATableInterface table) {
            this.table = table;
        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            this.table.setModel(rows);
        }

        @Override
        public String getHeaderText() {
            return this.table.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            this.table.setHeaderText(newHeaderText);

        }
    }

    public interface ATableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}