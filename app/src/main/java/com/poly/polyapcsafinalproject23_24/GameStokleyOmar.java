package com.poly.polyapcsafinalproject23_24;

import android.media.Image;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;

public class GameStokleyOmar extends GameActivity {

    //create variables up here
    private StokleySorcerer player;
    private ArrayList<StokleySorcerer> characters;

    private int curCharacterSelectIndex;
    private ImageView ivCharSelect;
    private ImageButton btnPrev, btnNext;

    public GameStokleyOmar()
    {
        /**
         *array of characters from SorcererFactory
         */
        this.characters = new ArrayList<StokleySorcerer>();
        characters.add( StokleySorcererFactory.itadori() );
        characters.add( StokleySorcererFactory.megumi() );
        characters.add( StokleySorcererFactory.nobara() );
        characters.add( StokleySorcererFactory.Gojo() );
        characters.add( StokleySorcererFactory.geto() );
        characters.add( StokleySorcererFactory.Jogo() );
        characters.add( StokleySorcererFactory.Dagon() );
        characters.add( StokleySorcererFactory.hanami() );
        characters.add( StokleySorcererFactory.mahito() );
        characters.add( StokleySorcererFactory.toji() );
        characters.add( StokleySorcererFactory.yuta() );
        characters.add( StokleySorcererFactory.Choso() );
        characters.add( StokleySorcererFactory.maki() );
        characters.add( StokleySorcererFactory.inumaki() );
        characters.add( StokleySorcererFactory.kashimo() );
        characters.add( StokleySorcererFactory.mahoraga() );
        characters.add( StokleySorcererFactory.transformedMahito() );
        characters.add( StokleySorcererFactory.yorozu() );
        characters.add( StokleySorcererFactory.kenjaku() );
        characters.add( StokleySorcererFactory.kusakabe() );
        characters.add( StokleySorcererFactory.sukuna() );
    }



    //write game down here
    //  use other void methods as nesssary
    //  use loops as nessesary
    public void run()
    {
        /**
         *STEPS OF RUNNING
         *1. Character select screen where the character list is presented
         *2. The selection of character is made and the player is set to fight the other characters in the list
         *3. The player selects their character before going to the arena where the battle class is run
         */
        selectCharacter();
    }

    private void selectCharacter()
    {
        setContentView(R.layout.activity_stokleyomar_character_select);

        btnPrev = (ImageButton) findViewById(R.id.btn_prev);
        btnNext = (ImageButton) findViewById(R.id.btn_next);

        Button btnContinue = findViewById(R.id.btn_continue);

        curCharacterSelectIndex = 0;

        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curCharacterSelectIndex = ((curCharacterSelectIndex - 1) + characters.size()) % characters.size();

                ivCharSelect.setImageResource(characters.get(curCharacterSelectIndex).getImageId());

                Log.d("curr image ID", ""+characters.get(curCharacterSelectIndex).getImageId());



            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curCharacterSelectIndex = ((curCharacterSelectIndex + 1) + characters.size()) % characters.size();

                Log.d("curr image ID", ""+characters.get(curCharacterSelectIndex).getImageId());
            }
        });

        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player = characters.get(curCharacterSelectIndex);

                Log.d("ClickedD", "NEXT");
                goToTheArena();
            }
        });


    }

    private void goToTheArena()
    {
        for (int i=0; i<characters.size(); i++)
        {
            StokleyBattle battle = new StokleyBattle(player, characters.get(i));
            battle.run();
        }
    }

    private void runBattle() {

    }



}