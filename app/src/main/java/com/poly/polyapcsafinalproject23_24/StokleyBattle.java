package com.poly.polyapcsafinalproject23_24;

public class StokleyBattle {
    private StokleySorcerer player;
    private StokleySorcerer enemy;
    private int turn;

    public Battle(StokleySorcerer player, StokleySorcerer enemy)
    {
        /**
         *establishing which character is the player and which is the enemy
         *turn order decided for each round
         */
        this.player = player;
        this.enemy = enemy;
        this.turn = (int) (Math.random()*2);
    }

    public void run()
    /**
     *Both player and enemy turns are decided and both enemy and player are labeled either attacker or defender depending on the turn
     */
    {
        beginBattle();
        while (player.getHp() > 0 && enemy.getHp() > 0)
        {
            displayStats();
            if (turn%2==0)
            {
                takeTurnAttacking(player,enemy);
            }
            else
            {
                takeTurnAttacking(enemy,player);
            }
            turn++;
        }
        //code what happens when battle ends
        // determine who lost (if player has less than or equal to 0 hp, etc)
    }

    private void beginBattle()
    {

    }

    private void displayStats()
    /**
     *Stats are displayed for the player to see of both the enemy and the player
     */
    {
        Util.clearConsole();
        System.out.println("STATS");
        System.out.println(player.getName() + ": " + player.getHp() + " hp");
        System.out.println(enemy.getName() + ": " + enemy.getHp() + " hp");
    }


    private void takeTurnAttacking(Sorcerer attacker, Sorcerer defender)
    /**
     *setting the attacks for both player and enemy
     */
    {
        attacker.setBlocking(false);
        Attack attack = new Attack();

        int option = 1;

        if (attacker == player)
        {
            System.out.println("1. " + player.getLightAttack().getName());
            System.out.println("2. " + player.getHeavyAttack().getName());
            System.out.println("3. " + player.getSpecialAttack().getName());
            System.out.println("4. Block");
            option = Util.enterInt(1,4);
        }
        else
        {
            option = (int) (1 + Math.random()*4);
        }

        if (option == 4)
        {
            Util.clearConsole();
            attacker.setBlocking(true);
            System.out.println(attacker.getName() + " is blocking.");
            Util.pauseConsole();
        }
        else
        {
            if (option == 1)
            {
                attack = attacker.getLightAttack();
            }
            else if (option == 2)
            {
                attack = attacker.getHeavyAttack();
            }
            else if (option == 3)
            {
                attack = attacker.getSpecialAttack();
            }

            /**
             *Affects of heavy attacks and the affects of blocking are implemented here
             *Dialouge for blocking and attacking is established
             */
            Util.clearConsole();
            if (defender.isBlocking() && !attack.isHeavyAttack())
            {
                System.out.println(attacker.getName() + " used " + attack.getName() + "." );
                Util.pauseConsole();
                System.out.println(defender.getName() + " is blocking!");
                Util.pauseConsole();
            }
            else if (defender.isBlocking() && attack.isHeavyAttack())
            {
                defender.takeDamage(attack.getDmg());
                System.out.println(defender.getName() + " is blocking!");
                Util.pauseConsole();
                System.out.println(attacker.getName() + " breaks the block!");
                Util.pauseConsole();
                System.out.println(attacker.getName() + " used " + attack.getName() + " and " + defender.getName() + " takes " + attack.getDmg() + " damage!");
                Util.pauseConsole();
            }
            else
            {
                defender.takeDamage(attack.getDmg());
                System.out.println(attacker.getName() + " used " + attack.getName() + " and " + defender.getName() + " takes " + attack.getDmg() + " damage!");
                Util.pauseConsole();
            }

            /**
             *Effects are written here
             * Stunned skips the opponent's turn
             * Bleed causes the opponent to lose 100 HP
             * Strengthen doubles the damage of all attacks
             * Poison causes the opponent to lose 75 HP
             */
            if (attack.getEffect().equals("Stunned"))
            {
                turn++;
                System.out.println(defender.getName() + " was stunned and can't move!");
                Util.pauseConsole();
            }
            if (attack.getEffect().equals("bleed"))
            {
                defender.takeDamage(100);
                System.out.println(defender.getName() + " takes 100 damage from the bleed!");
                Util.pauseConsole();
            }
            if (attack.getEffect().equals("Strengthen"))
            {
                System.out.println(attacker.getName() + " has broken their limits and gotten stronger!");
                Util.pauseConsole();
            }
            if (attack.getEffect().equals("Poisoned"))
            {
                defender.takeDamage(75);
                System.out.println(defender.getName() + " takes damage 75 from the poison!");
                Util.pauseConsole();
            }
        }
}
