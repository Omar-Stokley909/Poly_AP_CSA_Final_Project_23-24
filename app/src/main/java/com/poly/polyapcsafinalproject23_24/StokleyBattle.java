package com.poly.polyapcsafinalproject23_24;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class StokleyBattle extends GameActivity {
    private StokleySorcerer player;
    private StokleySorcerer enemy;
    private int turn;

    ImageView ivPlayer, ivEnemy;
    ProgressBar pbPlayerHealth, pbEnemyHealth;

    Button btnAttack1, btnAttack2, btnAttack3, btnAttack4;
    TextView tvBattle, tvPlayerName, tvEnemyName;

    private int maxHpPlayer, maxHpEnemy;

    public StokleyBattle(StokleySorcerer player, StokleySorcerer enemy) {

        this.player = player;
        this.enemy = enemy;
        this.turn = (int) (Math.random() * 2);
        this.maxHpPlayer = player.getHp();
        this.maxHpEnemy = enemy.getHp();
    }

    public void run() {
        setContentView(R.layout.activity_stokleyomar_battle);

        ivPlayer = findViewById(R.id.iv_player);
        ivEnemy = findViewById(R.id.iv_enemy);
        btnAttack1 = findViewById(R.id.btn_attack1);
        btnAttack2 = findViewById(R.id.btn_attack2);
        btnAttack3 = findViewById(R.id.btn_attack3);
        btnAttack4 = findViewById(R.id.btn_attack4);
        tvBattle = findViewById(R.id.tv_battle_text);
        tvPlayerName = findViewById(R.id.tv_player_name);
        tvEnemyName = findViewById(R.id.tv_enemy_name);
        pbPlayerHealth = (ProgressBar) findViewById(R.id.bar_player_health);
        pbEnemyHealth = (ProgressBar) findViewById(R.id.bar_enemy_health);

        if (player.getHp() > 0 && enemy.getHp() > 0) {
            displayStats();
            if (turn % 2 == 0) {
                try {
                    takeTurnAttacking(player, enemy);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else {
                try {
                    takeTurnAttacking(enemy, player);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            turn++;
            run();
        }
        //code what happens when battle ends
        // determine who lost (if player has less than or equal to 0 hp, etc)
    }

    private void displayStats()
    /**
     *Stats are displayed for the player to see of both the enemy and the player
     */
    {
        tvPlayerName.setText(player.getName());
        tvEnemyName.setText(enemy.getName());

        pbPlayerHealth.setMin(0);
        pbPlayerHealth.setMax(maxHpPlayer);
        pbPlayerHealth.setProgress(player.getHp());

        pbPlayerHealth.setMin(0);
        pbPlayerHealth.setMax(maxHpEnemy);
        pbPlayerHealth.setProgress(enemy.getHp());

    }


    private void takeTurnAttacking(StokleySorcerer attacker, StokleySorcerer defender) throws InterruptedException
    /**
     *setting the attacks for both player and enemy
     */
    {
        attacker.setBlocking(false);
        StokleyAttack attack = new StokleyAttack();

        int option = 1;

        if (attacker == player) {
            btnAttack1.setText(player.getLightAttack().getName());
            btnAttack2.setText(player.getHeavyAttack().getName());
            btnAttack3.setText(player.getSpecialAttack().getName());
            btnAttack1.setText(player.getLightAttack().getName());
            btnAttack2.setText(player.getHeavyAttack().getName());
            btnAttack3.setText("Block");
        } else {
            option = (int) (1 + Math.random() * 4);
        }

        if (option == 4) {
            Thread.sleep(1000);
            attacker.setBlocking(true);
            System.out.println(attacker.getName() + " is blocking.");
            Thread.sleep(1000);
        } else {
            if (option == 1) {
                attack = attacker.getLightAttack();
            } else if (option == 2) {
                attack = attacker.getHeavyAttack();
            } else if (option == 3) {
                attack = attacker.getSpecialAttack();
            }

            /**
             *Affects of heavy attacks and the affects of blocking are implemented here
             *Dialouge for blocking and attacking is established
             */
            Thread.sleep(1000);
            if (defender.isBlocking() && !attack.isHeavyAttack()) {
                System.out.println(attacker.getName() + " used " + attack.getName() + ".");
                Thread.sleep(1000);
                System.out.println(defender.getName() + " is blocking!");
                Thread.sleep(1000);
            } else if (defender.isBlocking() && attack.isHeavyAttack()) {
                defender.takeDamage(attack.getDmg());
                System.out.println(defender.getName() + " is blocking!");
                Thread.sleep(1000);
                System.out.println(attacker.getName() + " breaks the block!");
                Thread.sleep(1000);
                System.out.println(attacker.getName() + " used " + attack.getName() + " and " + defender.getName() + " takes " + attack.getDmg() + " damage!");
                Thread.sleep(1000);
            } else {
                defender.takeDamage(attack.getDmg());
                System.out.println(attacker.getName() + " used " + attack.getName() + " and " + defender.getName() + " takes " + attack.getDmg() + " damage!");
                Thread.sleep(1000);
            }

            /**
             *Effects are written here
             * Stunned skips the opponent's turn
             * Bleed causes the opponent to lose 100 HP
             * Strengthen doubles the damage of all attacks
             * Poison causes the opponent to lose 75 HP
             */
            if (attack.getEffect().equals("Stunned")) {
                turn++;
                System.out.println(defender.getName() + " was stunned and can't move!");
                Thread.sleep(1000);
            }
            if (attack.getEffect().equals("bleed")) {
                defender.takeDamage(100);
                System.out.println(defender.getName() + " takes 100 damage from the bleed!");
                Thread.sleep(1000);
            }
            if (attack.getEffect().equals("Strengthen")) {
                System.out.println(attacker.getName() + " has broken their limits and gotten stronger!");
                Thread.sleep(1000);
            }
            if (attack.getEffect().equals("Poisoned")) {
                defender.takeDamage(75);
                System.out.println(defender.getName() + " takes damage 75 from the poison!");
                Thread.sleep(1000);
            }
        }
    }
}
