package com.poly.polyapcsafinalproject23_24;

public class StokleySorcererFactory {
    /**
     *The SorcererFactory where all of the characters in the game reside and function
     */
    public static Sorcerer itadori()
    {
        Sorcerer sorcerer = new Sorcerer("Itadori Yuji", 900);
        sorcerer.setLightAttacK("Jab", 120, 1.0);
        sorcerer.setHeavyAttacK("Divergent Fist", 185, 0.8);
        sorcerer.setSpecialAttack("Black Flash", 375, 1.0, false, "None");
        return sorcerer;
    }
    public static Sorcerer sukuna()
    {
        Sorcerer sorcerer = new Sorcerer("Ryomen Sukuna",1805);
        sorcerer.setLightAttacK("Cleave", 450, 0.7);
        sorcerer.setHeavyAttacK("Dismantle", 400, 1.0);
        sorcerer.setSpecialAttack("Domain Expansion: Malevolent Shrine", 500, 1.0, true, "bleed");
        return sorcerer;
    }
    public static Sorcerer megumi()
    {
        Sorcerer sorcerer = new Sorcerer("Megumi Fushiguro", 925);
        sorcerer.setLightAttacK("Twin Dog Attack", 120, 0.8);
        sorcerer.setHeavyAttacK("Nue Shock Dive", 200, 0.6);
        sorcerer.setSpecialAttack("Domain Expansion: Chimera Shadow Garden", 350, 1.0, true, "None");
        return sorcerer;
    }
    public static Sorcerer mahoraga()
    {
        Sorcerer sorcerer = new Sorcerer("Eight-Handled Sword Divergent Sila Divine General Mahoraga", 1900);
        sorcerer.setLightAttacK("Adapting Slash", 75, 1.0);
        sorcerer.setHeavyAttacK("Grab 'n Smash'", 80, 0.8);
        sorcerer.setSpecialAttack("Immideate Adaptation", 0, 1.0, true, "Strengthen");
        return sorcerer;
    }
    public static Sorcerer nobara()
    {
        Sorcerer sorcerer = new Sorcerer("Nobara Kugisaki", 1200);
        sorcerer.setLightAttacK("Hammer Smash", 75, 1.0);
        sorcerer.setHeavyAttacK("Hairpin", 90, 0.7);
        sorcerer.setSpecialAttack("Resonance", 240, 1.0, true, "Weakened");
        return sorcerer;
    }
    public static Sorcerer Gojo()
    {
        Sorcerer sorcerer = new Sorcerer("Satoru Gojo", 1800);
        sorcerer.setLightAttacK("Reversal Red", 220, 0.8);
        sorcerer.setHeavyAttacK("Hollow Purple", 280, 0.6);
        sorcerer.setSpecialAttack("Domain Expansion: Unlimited Void", 400, 1.0, true, "Stunned");
        return sorcerer;
    }
    public static Sorcerer Jogo()
    {
        Sorcerer sorcerer = new Sorcerer("Jogo", 1000);
        sorcerer.setLightAttacK("Pyrotechnic Calamity", 150, 0.8);
        sorcerer.setHeavyAttacK("Max Meteor", 350, 0.5);
        sorcerer.setSpecialAttack("Domain Expansion: Coffin of the Iron Mountain", 450, 1.0, true, "None");
        return sorcerer;
    }
    public static Sorcerer Dagon()
    {
        Sorcerer sorcerer = new Sorcerer("Dagon", 1000);
        sorcerer.setLightAttacK("Deadly Water", 180, 0.8);
        sorcerer.setHeavyAttacK("Scary Fish", 280, 0.8);
        sorcerer.setSpecialAttack("Domain Expansion: Horizon of the Captivating Skandhva", 450, 1.0, true, "None");
        return sorcerer;
    }
    public static Sorcerer hanami()
    {
        Sorcerer sorcerer = new Sorcerer("Hanami", 1800);
        sorcerer.setLightAttacK("Roots", 100, 0.8);
        sorcerer.setHeavyAttacK("Cursed Bud", 75, 1.0);
        sorcerer.setSpecialAttack("Domain Expansion: Cerimonial Sea of Light", 375, 1.0, true, "None");
        return sorcerer;
    }

    public static Sorcerer mahito()
    {
        Sorcerer sorcerer = new Sorcerer("Mahito", 1000);
        sorcerer.setLightAttacK("Body Repel", 110, 1.0);
        sorcerer.setHeavyAttacK("Idle Transfiguration", 1500, 0.1);
        sorcerer.setSpecialAttack("Domain Expansion: Self Embodiment of Perfection", 500, 1.0, true, "None");
        return sorcerer;
    }
    public static Sorcerer transformedMahito()
    {
        Sorcerer sorcerer = new Sorcerer("Mahito: Instant Spirit Body of Distorted Killing", 1000);
        sorcerer.setLightAttacK("Rising Soul", 169, 1.0);
        sorcerer.setHeavyAttacK("Soul Multiplicty", 190, 1.0);
        sorcerer.setSpecialAttack("Black Flash", 500, 1.0, false, "None");
        return sorcerer;
    }

    public static Sorcerer toji()
    {
        Sorcerer sorcerer = new Sorcerer("Toji Fushiguro", 1800);
        sorcerer.setLightAttacK("Soul Splitting Slash", 275, 0.8);
        sorcerer.setHeavyAttacK("Heavenly Spear", 250, 0.8);
        sorcerer.setSpecialAttack("Overwhelming Intensity", 150, 1.0, true, "Strengthen");
        return sorcerer;
    }
    public static Sorcerer yuta()
    {
        Sorcerer sorcerer = new Sorcerer("Yuta Okotsu", 1200);
        sorcerer.setLightAttacK("Cursed Cutter", 105, 1.0);
        sorcerer.setHeavyAttacK("Curse Crush", 125, 0.8);
        sorcerer.setSpecialAttack("Domain Expansion: True and Mutual Love", 375, 1.0, true, "None");
        return sorcerer;
    }
    public static Sorcerer Choso()
    {
        Sorcerer sorcerer = new Sorcerer("Choso", 1200);
        sorcerer.setLightAttacK("Slicing Exorsisim", 100, 0.8);
        sorcerer.setHeavyAttacK("Piercing Blood", 85, 1.0);
        sorcerer.setSpecialAttack("Convergence: Supernova", 350, 1.0, false, "Poisoned");
        return sorcerer;
    }
    public static Sorcerer maki()
    {
        Sorcerer sorcerer = new Sorcerer("Maki Zen'in", 1500);
        sorcerer.setLightAttacK("Rushdown", 85, 1.0);
        sorcerer.setHeavyAttacK("Playful Cloud", 150, 0.7);
        sorcerer.setSpecialAttack("Forged in Flames", 150, 1.0, false, "strengthen");
        return sorcerer;
    }
    public static Sorcerer inumaki()
    {
        Sorcerer sorcerer = new Sorcerer("Inumaki", 1200);
        sorcerer.setLightAttacK("Crush", 120, 0.8);
        sorcerer.setHeavyAttacK("Fall", 180, 0.8);
        sorcerer.setSpecialAttack("Freeze, Smash, Fall", 350, 1.0, false, "Stunned");
        return sorcerer;
    }
    public static Sorcerer kashimo()
    {
        Sorcerer sorcerer = new Sorcerer("Hajime Kashimo", 1200);
        sorcerer.setLightAttacK("Rising Voltage", 120, 0.8);
        sorcerer.setHeavyAttacK("Thunder Gauntlet", 180, 0.8);
        sorcerer.setSpecialAttack("Lightning Discharge", 400, 1.0, true, "Stunned");
        return sorcerer;
    }

    public static Sorcerer kusakabe()
    {
        Sorcerer sorcerer = new Sorcerer("Atsuya Kusakabe", 1200);
        sorcerer.setLightAttacK("Batto Sword Drawing", 220, 0.8);
        sorcerer.setHeavyAttacK("Evening Moon Sword Drawing", 180, 0.8);
        sorcerer.setSpecialAttack("Simple Domain: Rending Moonbow", 350, 1.0, false, "None");
        return sorcerer;
    }

    public static Sorcerer geto()
    {
        Sorcerer sorcerer = new Sorcerer("Suguru Geto", 1800);
        sorcerer.setLightAttacK("Cursed Spirit Barrage", 240, 0.8);
        sorcerer.setHeavyAttacK("Swirling Centipedes", 280, 0.8);
        sorcerer.setSpecialAttack("Maximum Technique: Uzamaki", 450, 1.0, false, "None");
        return sorcerer;
    }

    public static Sorcerer kenjaku()
    {
        Sorcerer sorcerer = new Sorcerer("Kenjaku", 1800);
        sorcerer.setLightAttacK("Anti-Gravity System", 180, 1.0);
        sorcerer.setHeavyAttacK("Maximum Technique: Uzamaki", 225, 0.8);
        sorcerer.setSpecialAttack("Domain Expansion: Womb Perfusion", 450, 1.0, true, "None");
        return sorcerer;
    }

    public static Sorcerer yorozu()
    {
        Sorcerer sorcerer = new Sorcerer("Yorozu", 1500);
        sorcerer.setLightAttacK("Liquid Metal", 180, 0.8);
        sorcerer.setHeavyAttacK("Perfect Sphere", 280, 0.8);
        sorcerer.setSpecialAttack("Domain Expansion: Threefold Afliction", 380, 1.0, true, "stunned");
        return sorcerer;
    }
}
