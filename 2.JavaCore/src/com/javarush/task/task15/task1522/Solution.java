package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    static {
        try{
            readKeyFromConsoleAndInitPlanet();
        } catch (IOException e){}
    }

    public static void readKeyFromConsoleAndInitPlanet() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        if(name.equals(Planet.EARTH) || name.equals(Planet.SUN) || name.equals(Planet.MOON)) {
            if (name.equals(Planet.EARTH))
                thePlanet = Earth.getInstance();
            else if (name.equals(Planet.MOON))
                thePlanet = Moon.getInstance();
            else if (name.equals(Planet.SUN))
                thePlanet = Sun.getInstance();
        }
        else thePlanet = null;
    }
}
