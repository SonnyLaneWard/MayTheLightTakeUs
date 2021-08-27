import java.util.Arrays;
import java.util.Scanner;

public class GamePlay {
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        //System.out.println("Choose language:0 for English, 1 for Russian");
        //int choselanguage = in.nextInt();


        Story begin = new Story();
         System.out.println(YELLOW + begin.number(0) + RESET);

        Scanner line = new Scanner(System.in);
        System.out.println("Insert your name");
        String name = line.nextLine();
        System.out.println("Insert your wisdom points (no more than 9)");
        int wisdom = in.nextInt();
        System.out.println("Insert your strength points (no more than 4, and it depends....)");
        int strength = in.nextInt();
        int sanity = 10;
        HeroEntities hero = new HeroEntities(name,wisdom,strength,sanity);

        System.out.println("Insert 1 to watch your hero stats");

        int command = in.nextInt();

        if (command == 1)
        {
            Stats.stats(hero);
        }

        System.out.println(YELLOW + begin.number(2) + RESET);
        System.out.println("Insert "); //Crossroad1
        command = in.nextInt();
        if (command == 1)
        {
            System.out.println(YELLOW + begin.number(3) + RESET);
            hero.setStrenth(2);
            hero.statistics();
            hero.talk();
            System.out.println(YELLOW + begin.number(4) + RESET);
            hero.talk();
            hero.setSanity(9);
            hero.statistics();
            hero.talk();
            DarkEntities lich = new DarkEntities();
            lich.setName("KING LICH");
            lich.setStrength(8);
            lich.talk();
            System.out.println(YELLOW + "You can peek at his stats if you want but it will cost you sanity" + RESET);
            System.out.println(YELLOW + "SO? (1 - yes, 0- no)" + RESET);
            int peek = in.nextInt();
            if (peek == 1)
            {
                hero.setSanity(8);
                Stats.stats(hero, lich);
            }
            else if (peek == 0){
                System.out.println(YELLOW + "I get it - you are tough" + RESET);
            }

            LichDialog.talk();
            LichFight.fight();
            System.out.println(GREEN + "All that left of lich is his staff, so you pick it"+ RESET);
            System.out.println(YELLOW + "You now have a new weapon" + RESET);
            Weapon weapon = new Weapon(2, "Lich's Staff");
            Stats.stats(weapon);


        }
       else if (command == 2)
        {
            System.out.println(YELLOW + begin.number(5) + RESET);

        }
        else if (command == 3)
        {
            hero.statistics();
        }
    }
}
