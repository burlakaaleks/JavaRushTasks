package com.javarush.task.task12.task1226;

/* 
Лазать, летать и бегать
*/

public class Solution {

    public static void main(String[] args) {

    }

    public interface Fly { public void fly(); }
    public interface Run { public void run(); }
    public interface Climb { public void climb();}

    public abstract class Cat implements Run, Climb {
    }

    public abstract class Dog implements Run {
    }

    public abstract class Tiger extends Cat {
    }

    public abstract class Duck implements Run, Fly {
    }
}
