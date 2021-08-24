import java.util.Scanner;

public class LichFight {
    public static void fight()
    {
        System.out.println("Press 1 to strike the lich with a sword ( you have a sword - ...nice)");
        Scanner in = new Scanner(System.in);
        int command = in.nextInt();
       DarkEntities lich = new DarkEntities();
       lich.setStrength(lich.strength - 1);
       lich.statistics();

    }
}
