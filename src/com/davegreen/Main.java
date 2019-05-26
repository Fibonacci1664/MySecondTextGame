package com.davegreen;

import java.util.Scanner;
import java.util.Random;

public class Main
{

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public static void main(String[] args)
    {
        Enemy enemies = new Enemy();

        printEnemiesWrong();
        printEnemiesCorrect(enemies.getEnemies());
    }

    public static void printEnemiesWrong()
    {
        Enemy enemies = new Enemy();

        System.out.println(enemies.getEnemies().length);
        System.out.println(enemies.getEnemies());
    }

    public static void printEnemiesCorrect(String[] badguys)
    {
        for(int i = 0; i < badguys.length; i++)
        {
            if(i >= 0)
            {
                System.out.println(badguys[i]);
            }
        }
    }
}
