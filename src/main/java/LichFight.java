import java.util.Scanner;

public class LichFight {
    public static void fight()
    {
        System.out.println("Press 1 to strike the lich with a sword ( you have a sword - ...nice)");
        Scanner in = new Scanner(System.in);
        int command = in.nextInt();
       DarkEntities lich = new DarkEntities();
       lich.setName("KING LICH");
       lich.setStrength(8);
       lich.setStrength(lich.strength - 1);
       lich.statistics();
       while (lich.strength > 0)
       {
           System.out.println("Press 1 to strike the lich with a sword ( you have a sword - ...nice)");
           int wait = in.nextInt();
           System.out.println("the lich doesnt respond");
           lich.setStrength(lich.strength - 1);
          System.out.println(lich.statistics());
       }
        System.out.println("the lich is no more...passed away...rip....dead");
    }
}
