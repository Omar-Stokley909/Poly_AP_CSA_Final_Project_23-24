import java.util.Scanner;
import java.util.ArrayList;

public class GameStokleyOmar {

    //create variables up here
    private Sorcerer player;
    private ArrayList<Sorcerer> characters;

    public Game()
    {
        /**
         *array of characters from SorcererFactory
         */
        this.characters = new ArrayList<Sorcerer>();
        characters.add( SorcererFactory.itadori() );
        characters.add( SorcererFactory.megumi() );
        characters.add( SorcererFactory.nobara() );
        characters.add( SorcererFactory.Gojo() );
        characters.add( SorcererFactory.geto() );
        characters.add( SorcererFactory.Jogo() );
        characters.add( SorcererFactory.Dagon() );
        characters.add( SorcererFactory.hanami() );
        characters.add( SorcererFactory.mahito() );
        characters.add( SorcererFactory.toji() );
        characters.add( SorcererFactory.yuta() );
        characters.add( SorcererFactory.Choso() );
        characters.add( SorcererFactory.maki() );
        characters.add( SorcererFactory.inumaki() );
        characters.add( SorcererFactory.kashimo() );
        characters.add( SorcererFactory.mahoraga() );
        characters.add( SorcererFactory.transformedMahito() );
        characters.add( SorcererFactory.yorozu() );
        characters.add( SorcererFactory.kenjaku() );
        characters.add( SorcererFactory.kusakabe() );
        characters.add( SorcererFactory.sukuna() );
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
        goToTheArena();
    }

    private void selectCharacter()
    {
        String text = """
 Welcome to Jujitsu Kaisen Cursed royale! Please select you fighter.
      """;
        System.out.println(text);

        for (int i=0; i<characters.size(); i++)
        {
            System.out.println( (i+1) + ": " + characters.get(i).getName() );
        }
        int option = Util.enterInt(1,characters.size());

        player = characters.get(option-1);
        characters.remove(option-1);
    }

    private void goToTheArena()
    {
        for (int i=0; i<characters.size(); i++)
        {
            Battle battle = new Battle(player, characters.get(i));
            battle.run();
        }
    }



}