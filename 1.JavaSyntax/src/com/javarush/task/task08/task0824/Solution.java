package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> ch = new ArrayList<>();
        ch.add(new Human("Vitaliy", true, 12));
        ch.add(new Human("Misha", true, 2));
        ch.add(new Human("Zhenya", true, 7));

        ArrayList<Human> fatherchild = new ArrayList<>();
        ArrayList<Human> motherchild = new ArrayList<>();

        fatherchild.add(new Human("Alex", true, 33, ch));
        motherchild.add(new Human("Masha", false, 32, ch));

        Human babka1 = new Human("Vera", false, 70, fatherchild);
        Human ded1 = new Human("Zhora", true, 75, fatherchild);

        Human babka2 = new Human("Anna", false, 73, motherchild);
        Human ded2 = new Human("Victor", true, 80, motherchild);

        System.out.println(ded1.toString()+"\n"+
                ded2.toString()+"\n"+
                babka1.toString()+"\n"+
                babka2.toString()+"\n"+
                fatherchild.get(0)+"\n"+
                motherchild.get(0)+"\n"+
                ch.get(0)+"\n"+
                ch.get(1)+"\n"+
                ch.get(2));
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human (String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human (String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;

        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
