import java.util.Scanner;
public class GamePlay {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Choose language:0 for English, 1 for Russian");
        int choselanguage = in.nextInt();


        Story begin = new Story();
         System.out.println(begin.number(choselanguage));

        Scanner line = new Scanner(System.in);
        System.out.println("Insert your name");
        String name = line.nextLine();
        System.out.println("Insert your wisdom points (no more than 9)");
        int wisdom = in.nextInt();
        System.out.println("Insert your wisdom points (no more than 4, and it depends....)");
        int strength = in.nextInt();

        HeroEntities hero = new HeroEntities(name,wisdom,strength);
        System.out.println("Insert 1 to watch your hero stats");
        int command = in.nextInt();
        if (command == 1)
        {
            hero.statistics();
        }

        System.out.println(begin.number(2));
        System.out.println("Insert ");
        command = in.nextInt();
        if (command == 1)
        {
            System.out.println(begin.number(3));
            hero.setStrenth(2);
            hero.statistics();
        }
       else if (command == 2)
        {
            hero.statistics();
        }
        else if (command == 3)
        {
            hero.statistics();
        }
    }
}
