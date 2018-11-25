package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    public String name;
    public String color;
    public String address;
    public int age = 1;
    public int weight = 2;

    public Cat(String name){
        this.name = name;
        this.color = "default";

    }
    public Cat(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "default";
    }
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        this.color = "default";
    }
    public Cat(int weight, String color){
        this.weight = weight;
        this.color = color;
    }
    public Cat(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
