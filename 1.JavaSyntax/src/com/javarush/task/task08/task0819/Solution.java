package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        printCats(cats);
        System.out.println(" ");
        Iterator<Cat> iterator = cats.iterator();
        while (iterator.hasNext())
            iterator.next();
            iterator.remove();

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> set = new HashSet<>();
        set.add(new Cat());
        set.add(new Cat());
        set.add(new Cat());
        return set;
    }

    public static void printCats(Set<Cat> cats) {
        Iterator<Cat> itr = cats.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public static class Cat {

    }
}
