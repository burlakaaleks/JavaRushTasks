package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    public String name;
    public String color;
    public String address;
    public int age = 1;
    public int weight = 2;

    public void initialize(String name){
        this.name = name;
        this.color = "default";

    }
    public void initialize(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "default";
    }
    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
        this.color = "default";
    }
    public void initialize(int weight, String color){
        this.weight = weight;
        this.color = color;
    }
    public void initialize(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
