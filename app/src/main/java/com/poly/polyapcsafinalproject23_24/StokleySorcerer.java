package com.poly.polyapcsafinalproject23_24;

import com.poly.polyapcsafinalproject23_24.StokleyAttack;

public class StokleySorcerer {
    ;
    //attributes
    //instance variables
    //fields

    private String name;
    private int hp;
    private StokleyAttack lightAttack;
    private StokleyAttack heavyAttack;
    private StokleyAttack specialAttack;
    private boolean isBlocking;
    private final int ID;
    private static int numSorcerers;
    //---------------------------------------------------------------------------------------------------------------------------------
    //CONSTRUCTORS
    //Constructors are used to initializes objects from the class
    //DEFAULT CONSTRUCTOR - no parameters
    //aka Pig piggy = new pig
    //---------------------------------------------------------------------------------------------------------------------------------
    public StokleySorcerer()
    {
        this.name = " ";
        this.hp = 0;
        this.lightAttack = new StokleyAttack();
        this.heavyAttack = new StokleyAttack();
        this.specialAttack = new StokleyAttack();
        numSorcerers++;
        this.ID = numSorcerers;
    }

    public StokleySorcerer(String name, int hp)
    {
        this.name = name;
        this.hp = hp;
        this.lightAttack = new StokleyAttack();
        this.heavyAttack = new StokleyAttack();
        this.specialAttack = new StokleyAttack();
        numSorcerers++;
        this.ID = numSorcerers;
    }
//----------------------------------------------------------------------------------------------------------------------------------

    /**
     *List of getters and setters
     */
    public String getName()
    {
        return name;
    }

    public int getHp()
    {
        return hp;
    }

    public boolean isBlocking()
    {
        return isBlocking;
    }

    public StokleyAttack getLightAttack()
    {
        return lightAttack;
    }

    public StokleyAttack getHeavyAttack()
    {
        return heavyAttack;
    }

    public StokleyAttack getSpecialAttack()
    {
        return specialAttack;
    }

    public void setName(String newName)
    {
        name = newName;
    }

    public void setBlocking(boolean isBlocking)
    {
        this.isBlocking = isBlocking;
    }

    public void setHp (int newHp)
    {
        this.hp = newHp;
    }

    public void setLightAttacK(String name, int dmg, double accuracy)
    {
        this.lightAttack = new StokleyAttack(name, dmg, accuracy, false);
    }

    public void setHeavyAttacK(String name, int dmg, double accuracy)
    {
        this.heavyAttack = new StokleyAttack(name, dmg, accuracy, true);
    }

    public void setSpecialAttack(String name, int dmg, double accuracy, boolean isHeavyAttack, String effect)
    {
        this.specialAttack = new StokleyAttack(name, dmg, accuracy, isHeavyAttack, effect);
    }

    public void takeDamage(int damageTaken)
    {
        this.hp -= damageTaken;
    }
    //toString() method
    public String toString()
    {
        return "Sorcerer Name: " + name +
                "\t\tHP: " + hp;
    }
    public boolean equals (StokleySorcerer anotherSorcerer)
    {
        if (this.name.equals(anotherSorcerer.name) &&
                this.lightAttack.equals(anotherSorcerer.lightAttack) &&
                this.heavyAttack.equals(anotherSorcerer.heavyAttack) &&
                this.specialAttack.equals(anotherSorcerer.specialAttack) &&
                this.ID == anotherSorcerer.ID
        )
        {
            return false;
        }
        return true;
    }
}