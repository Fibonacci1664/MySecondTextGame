package com.davegreen;


/**
 * Created by daveg on 05/07/2017.
 */
public class Enemy
{
    private int maxHealth;
    private int maxAttackValue;
    private String[] enemies;

    public Enemy()
    {
        this.maxHealth = 100;
        this.maxAttackValue = 25;
        this.enemies = new String[] {"Skeleton", "Werewolf", "Giant Rat", "Wraith", "Ghoul"};
    }

    public int getMaxHealth()
    {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth)
    {
        this.maxHealth = maxHealth;
    }

    public int getMaxAttackValue()
    {
        return maxAttackValue;
    }

    public void setMaxAttackValue(int maxAttackValue)
    {
        this.maxAttackValue = maxAttackValue;
    }

    public String[] getEnemies()
    {
        return enemies;
    }

    public void setEnemies(String[] enemies)
    {
        this.enemies = enemies;
    }
}
