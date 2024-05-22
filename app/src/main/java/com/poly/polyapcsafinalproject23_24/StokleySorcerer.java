package com.poly.polyapcsafinalproject23_24;

public class StokleySorcerer {
    {
        this.name = " ";
        this.hp = 0;
        this.lightAttack = new Attack();
        this.heavyAttack = new Attack();
        this.specialAttack = new Attack();
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

    public Attack getLightAttack()
    {
        return lightAttack;
    }

    public Attack getHeavyAttack()
    {
        return heavyAttack;
    }

    public Attack getSpecialAttack()
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
        this.lightAttack = new Attack(name, dmg, accuracy, false);
    }

    public void setHeavyAttacK(String name, int dmg, double accuracy)
    {
        this.heavyAttack = new Attack(name, dmg, accuracy, true);
    }

    public void setSpecialAttack(String name, int dmg, double accuracy, boolean isHeavyAttack, String effect)
    {
        this.specialAttack = new Attack(name, dmg, accuracy, isHeavyAttack, effect);
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
    public boolean equals (Sorcerer anotherSorcerer)
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
}
