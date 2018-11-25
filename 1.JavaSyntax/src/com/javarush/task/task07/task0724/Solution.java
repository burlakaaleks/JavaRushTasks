package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human ded1 = new Human ("Volodya", true, 74 );
        Human baba1 = new Human("Zina", false, 69);
        Human ded2 = new Human("Zhora", true, 81);
        Human baba2 = new Human("Vera", false, 71);

        Human father = new Human("Vitaliy", true, 41, ded1, baba1);
        Human mother = new Human("Sveta", false, 33, ded2, baba2);

        Human child1 = new Human("Daniil", true, 11, father, mother);
        Human child2 = new Human("Liza", false, 8, father, mother);
        Human child3 = new Human("Nina", false, 3, father, mother);

        System.out.println(ded1.toString());
        System.out.println(ded2.toString());
        System.out.println(baba1.toString());
        System.out.println(baba2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human (String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human (String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















