package com.poly.polyapcsafinalproject23_24;

public class StokleySorcererFactory {
    /**
     *The SorcererFactory where all of the characters in the game reside and function
     */
    public static StokleySorcerer itadori()
    {
        StokleySorcerer sorcerer = new StokleySorcerer("Itadori Yuji", 900);
        sorcerer.setLightAttacK("Jab", 120, 1.0);
        sorcerer.setHeavyAttacK("Divergent Fist", 185, 0.8);
        sorcerer.setSpecialAttack("Black Flash", 375, 1.0, false, "None");
        sorcerer.setQuote("I am a jujutsu sorcerer");
        return sorcerer;
    }
    public static StokleySorcerer sukuna()
    {
        StokleySorcerer sorcerer = new StokleySorcerer("Ryomen Sukuna",1805);
        sorcerer.setLightAttacK("Cleave", 450, 0.7);
        sorcerer.setHeavyAttacK("Dismantle", 400, 1.0);
        sorcerer.setSpecialAttack("Domain Expansion: Malevolent Shrine", 500, 1.0, true, "bleed");
        sorcerer.setQuote("I am the strongest!");
        return sorcerer;
    }
    public static StokleySorcerer megumi()
    {
        StokleySorcerer sorcerer = new StokleySorcerer("Megumi Fushiguro", 925);
        sorcerer.setLightAttacK("Twin Dog Attack", 120, 0.8);
        sorcerer.setHeavyAttacK("Nue Shock Dive", 200, 0.6);
        sorcerer.setSpecialAttack("Domain Expansion: Chimera Shadow Garden", 350, 1.0, true, "None");
        sorcerer.setQuote("WITH THIS SACRED TREASURE I SUMMON-");
        return sorcerer;
    }
    public static StokleySorcerer mahoraga()
    {
        StokleySorcerer sorcerer = new StokleySorcerer("Eight-Handled Sword Divergent Sila Divine General Mahoraga", 1900);
        sorcerer.setLightAttacK("Adapting Slash", 75, 1.0);
        sorcerer.setHeavyAttacK("Grab 'n Smash'", 80, 0.8);
        sorcerer.setSpecialAttack("Immideate Adaptation", 0, 1.0, true, "Strengthen");
        sorcerer.setQuote("Big Ragga, the opp stoppa has arrived");
        return sorcerer;
    }
    public static StokleySorcerer nobara()
    {
        StokleySorcerer sorcerer = new StokleySorcerer("Nobara Kugisaki", 1200);
        sorcerer.setLightAttacK("Hammer Smash", 75, 1.0);
        sorcerer.setHeavyAttacK("Hairpin", 90, 0.7);
        sorcerer.setSpecialAttack("Resonance", 240, 1.0, true, "Weakened");
        sorcerer.setQuote("See you in hell loser!");
        return sorcerer;
    }
    public static StokleySorcerer Gojo()
    {
        StokleySorcerer sorcerer = new StokleySorcerer("Satoru Gojo", 1800);
        sorcerer.setLightAttacK("Reversal Red", 220, 0.8);
        sorcerer.setHeavyAttacK("Hollow Purple", 280, 0.6);
        sorcerer.setSpecialAttack("Domain Expansion: Unlimited Void", 400, 1.0, true, "Stunned");
        sorcerer.setQuote("Wow, that almost made me sweat!");
        return sorcerer;
    }
    public static StokleySorcerer Jogo()
    {
        StokleySorcerer sorcerer = new StokleySorcerer("Jogo", 1000);
        sorcerer.setLightAttacK("Pyrotechnic Calamity", 150, 0.8);
        sorcerer.setHeavyAttacK("Max Meteor", 350, 0.5);
        sorcerer.setSpecialAttack("Domain Expansion: Coffin of the Iron Mountain", 450, 1.0, true, "None");
        sorcerer.setQuote("No matter what, curses will become the true humans!");
        return sorcerer;
    }
    public static StokleySorcerer Dagon()
    {
        StokleySorcerer sorcerer = new StokleySorcerer("Dagon", 1000);
        sorcerer.setLightAttacK("Deadly Water", 180, 0.8);
        sorcerer.setHeavyAttacK("Scary Fish", 280, 0.8);
        sorcerer.setSpecialAttack("Domain Expansion: Horizon of the Captivating Skandhva", 450, 1.0, true, "None");
        sorcerer.setQuote("Gurgle Gurgle, blub!");
        return sorcerer;
    }
    public static StokleySorcerer hanami()
    {
        StokleySorcerer sorcerer = new StokleySorcerer("Hanami", 1800);
        sorcerer.setLightAttacK("Roots", 100, 0.8);
        sorcerer.setHeavyAttacK("Cursed Bud", 75, 1.0);
        sorcerer.setSpecialAttack("Domain Expansion: Cerimonial Sea of Light", 375, 1.0, true, "None");
        sorcerer.setQuote("Yroticv hitw ecarg");
        return sorcerer;
    }

    public static StokleySorcerer mahito()
    {
        StokleySorcerer sorcerer = new StokleySorcerer("Mahito", 1000);
        sorcerer.setLightAttacK("Body Repel", 110, 1.0);
        sorcerer.setHeavyAttacK("Idle Transfiguration", 1500, 0.1);
        sorcerer.setSpecialAttack("Domain Expansion: Self Embodiment of Perfection", 500, 1.0, true, "None");
        sorcerer.setQuote("wow that was fun! we should totally do it again sometime!");
        return sorcerer;
    }
    public static StokleySorcerer transformedMahito()
    {
        StokleySorcerer sorcerer = new StokleySorcerer("Mahito: Instant Spirit Body of Distorted Killing", 1000);
        sorcerer.setLightAttacK("Rising Soul", 270, 1.0);
        sorcerer.setHeavyAttacK("Soul Multiplicty", 290, 1.0);
        sorcerer.setSpecialAttack("Black Flash", 500, 1.0, false, "None");
        sorcerer.setQuote("I truly am...a curse!!!");
        return sorcerer;
    }

    public static StokleySorcerer toji()
    {
        StokleySorcerer sorcerer = new StokleySorcerer("Toji Fushiguro", 1800);
        sorcerer.setLightAttacK("Soul Splitting Slash", 275, 0.8);
        sorcerer.setHeavyAttacK("Heavenly Spear", 250, 0.8);
        sorcerer.setSpecialAttack("Overwhelming Intensity", 150, 1.0, true, "Strengthen");
        sorcerer.setQuote("All that to lose to a Jujuitsu-less monkey like me");
        return sorcerer;
    }
    public static StokleySorcerer yuta()
    {
        StokleySorcerer sorcerer = new StokleySorcerer("Yuta Okotsu", 1200);
        sorcerer.setLightAttacK("Cursed Cutter", 105, 1.0);
        sorcerer.setHeavyAttacK("Curse Crush", 125, 0.8);
        sorcerer.setSpecialAttack("Domain Expansion: True and Mutual Love", 375, 1.0, true, "None");
        sorcerer.setQuote("I may be cursed, but I will never let that define me,");
        return sorcerer;
    }
    public static StokleySorcerer Choso()
    {
        StokleySorcerer sorcerer = new StokleySorcerer("Choso", 1200);
        sorcerer.setLightAttacK("Slicing Exorsisim", 120, 0.8);
        sorcerer.setHeavyAttacK("Piercing Blood", 95, 1.0);
        sorcerer.setSpecialAttack("Convergence: Supernova", 350, 1.0, false, "Poisoned");
        sorcerer.setQuote("This...is for my brothers!");
        return sorcerer;
    }
    public static StokleySorcerer maki()
    {
        StokleySorcerer sorcerer = new StokleySorcerer("Maki Zen'in", 1500);
        sorcerer.setLightAttacK("Rushdown", 85, 1.0);
        sorcerer.setHeavyAttacK("Playful Cloud", 150, 0.7);
        sorcerer.setSpecialAttack("Forged in Flames", 150, 1.0, false, "strengthen");
        sorcerer.setQuote("I will never embrace the Zen'in clan");
        return sorcerer;
    }
    public static StokleySorcerer inumaki()
    {
        StokleySorcerer sorcerer = new StokleySorcerer("Inumaki", 1200);
        sorcerer.setLightAttacK("Crush", 120, 0.8);
        sorcerer.setHeavyAttacK("Fall", 180, 0.8);
        sorcerer.setSpecialAttack("Freeze, Smash, Fall", 350, 1.0, false, "Stunned");
        sorcerer.setQuote("Salmon roe, kelp, rice balls");
        return sorcerer;
    }
    public static StokleySorcerer kashimo()
    {
        StokleySorcerer sorcerer = new StokleySorcerer("Hajime Kashimo", 1200);
        sorcerer.setLightAttacK("Rising Voltage", 120, 0.8);
        sorcerer.setHeavyAttacK("Thunder Gauntlet", 180, 0.8);
        sorcerer.setSpecialAttack("Lightning Discharge", 400, 1.0, true, "Stunned");
        sorcerer.setQuote("Turn up the volume! This is a funeral for the living!");
        return sorcerer;
    }

    public static StokleySorcerer kusakabe()
    {
        StokleySorcerer sorcerer = new StokleySorcerer("Atsuya Kusakabe", 1200);
        sorcerer.setLightAttacK("Batto Sword Drawing", 220, 0.8);
        sorcerer.setHeavyAttacK("Evening Moon Sword Drawing", 180, 0.8);
        sorcerer.setSpecialAttack("Simple Domain: Rending Moonbow", 350, 1.0, false, "None");
        sorcerer.setQuote("Am I finally done? Jeez took long enough");
        return sorcerer;
    }

    public static StokleySorcerer geto()
    {
        StokleySorcerer sorcerer = new StokleySorcerer("Suguru Geto", 1800);
        sorcerer.setLightAttacK("Cursed Spirit Barrage", 240, 0.8);
        sorcerer.setHeavyAttacK("Swirling Centipedes", 280, 0.8);
        sorcerer.setSpecialAttack("Maximum Technique: Uzamaki", 450, 1.0, false, "None");
        sorcerer.setQuote("Hmph, not bad for a bunch of filthy monkeys");
        return sorcerer;
    }

    public static StokleySorcerer kenjaku()
    {
        StokleySorcerer sorcerer = new StokleySorcerer("Kenjaku", 1800);
        sorcerer.setLightAttacK("Anti-Gravity System", 180, 1.0);
        sorcerer.setHeavyAttacK("Maximum Technique: Uzamaki", 225, 0.8);
        sorcerer.setSpecialAttack("Domain Expansion: Womb Perfusion", 450, 1.0, true, "None");
        sorcerer.setQuote("This is my world, a world ruled by jujitsu!");
        return sorcerer;
    }

    public static StokleySorcerer yorozu()
    {
        StokleySorcerer sorcerer = new StokleySorcerer("Yorozu", 1500);
        sorcerer.setLightAttacK("Liquid Metal", 180, 0.8);
        sorcerer.setHeavyAttacK("Perfect Sphere", 280, 0.8);
        sorcerer.setSpecialAttack("Domain Expansion: Threefold Afliction", 380, 1.0, true, "stunned");
        sorcerer.setQuote("Maybe now Sukuna-sama will love me!");
        return sorcerer;
    }
}
