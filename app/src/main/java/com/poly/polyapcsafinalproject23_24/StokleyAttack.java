package com.poly.polyapcsafinalproject23_24;

public class StokleyAttack {
    /**
     *attack class where all of the attacks exist and function within each other
     */
    private String name;
    private int dmg;
    private double acc;
    private boolean isHeavyAttack;
    private String effect;

    public StokleyAttack()
    {
        this.name = "Empty";
        this.dmg = 0;
        this.acc = 0.0;
        this.isHeavyAttack = false;
        this.effect = "No effect";
    }

    //used for light and heavy attacks
    public StokleyAttack (String name, int dmg, double accuracy, boolean isHeavyAttack)
    {
        this.name = name;
        this.dmg = dmg;
        this.acc = accuracy;
        this.isHeavyAttack = isHeavyAttack;
        this.effect = "No effect";
    }

    //used for special attacks
    public StokleyAttack (String name, int dmg, double accuracy, boolean isHeavyAttack, String effect)
    {
        this.name = name;
        this.dmg = dmg;
        this.acc = accuracy;
        this.isHeavyAttack = isHeavyAttack;
        this.effect = effect;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDmg() {
        return dmg;
    }

    public boolean isHeavyAttack()
    {
        return isHeavyAttack;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    public double getAcc() {
        return acc;
    }

    public void setAcc(double acc) {
        this.acc = acc;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }


}