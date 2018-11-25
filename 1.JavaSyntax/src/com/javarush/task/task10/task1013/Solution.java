package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private boolean sex;
        private String address;
        private String education;
        private String nationality;

        public Human (String name) {
            this.name = name;
        }
        public Human (String name, int age) {
            this.name = name;
            this.age = age;
        }
        public Human (String name, int age, boolean sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
        public Human (String name, int age, boolean sex, String address) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.address = address;
        }
        public Human (String name, int age, boolean sex, String address, String nationality) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.address = address;
            this.nationality = nationality;
        }
        public Human (String name, int age, boolean sex, String address, String nationality, String education) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.address = address;
            this.nationality = nationality;
            this.education = education;
        }
        public Human (String name, int age, String education, boolean sex) {
            this.name = name;
            this.age = age;
            this.education = education;
            this.sex = sex;
        }

        public Human (int age, boolean sex, String education) {
            this.age = age;
            this.sex = sex;
            this.education = education;
        }
        public Human (String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public Human (String name, String address, String nationality, String education) {
            this.name = name;
            this.address = address;
            this.nationality = nationality;
            this.education = education;
        }
    }
}
