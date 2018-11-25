package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public static Hippodrome game;

    public void run() throws InterruptedException{
        for (int i = 0; i < 100 ; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    public void move(){
        for (int i = 0; i <horses.size() ; i++) {
            horses.get(i).move();
        }
    }
    
    public void print(){
        for (int i = 0; i < horses.size() ; i++) {
            horses.get(i).print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Horse getWinner(){
        Horse winner = horses.get(0);
        for(Horse horse : horses){
            if(horse.getDistance()>winner.getDistance()) winner = horse;
        }
        return winner;
    }

    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

    public static void main(String[] args) throws InterruptedException {
        game = new Hippodrome(new ArrayList<Horse>());
        Horse horse1 = new Horse("Belka", 3,0);
        Horse horse2 = new Horse("Orlyk", 3,0);
        Horse horse3 = new Horse("King", 3,0);
        game.getHorses().add(horse1);
        game.getHorses().add(horse2);
        game.getHorses().add(horse3);

        game.run();
        game.printWinner();

    }
}
