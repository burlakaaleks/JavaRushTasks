package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg chelik1 = new Zerg();
        chelik1.name = "Zerg1";
        Zerg chelik2 = new Zerg();
        chelik2.name = "Zerg2";
        Zerg chelik3 = new Zerg();
        chelik3.name = "Zerg3";
        Zerg chelik4 = new Zerg();
        chelik4.name = "Zerg4";
        Zerg chelik5 = new Zerg();
        chelik5.name = "Zerg5";
        Zerg chelik6 = new Zerg();
        chelik6.name = "Zerg6";
        Zerg chelik7 = new Zerg();
        chelik7.name = "Zerg7";
        Zerg chelik8 = new Zerg();
        chelik8.name = "Zerg8";
        Zerg chelik9 = new Zerg();
        chelik9.name = "Zerg9";
        Zerg chelik10 = new Zerg();
        chelik10.name = "Zerg10";

        for (int i=0; i<12; i++) {
            Terran terran = new Terran();
            terran.name = "Terran" + i;
        }

        for (int p=0; p<5; p++){
            Protoss protoss = new Protoss();
            protoss.name = "Protoss"+p;
        }
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
