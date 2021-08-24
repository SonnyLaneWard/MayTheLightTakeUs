import java.util.Scanner;

public class LichDialog {
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static void talk()
    {
     System.out.println(GREEN + "LICH::: You came here to distract me from a very important witchcraft things");
     System.out.println("LICH::: Why are you here?"+ RESET);
     System.out.println("Insert: 1 - talk, 2 - use wisdom, 3 - use sanity, 4 - fight");
     Scanner in = new Scanner(System.in);
     int command = in.nextInt();
     if (command == 1)
     {
         System.out.println(GREEN + "YOU::: I woke in the ravine");
         System.out.println("YOU::: And honestly I don't understand whats goin on"+ RESET);
         System.out.println("Insert: 1 to continue....");
         int wait = in.nextInt();
         System.out.println(GREEN + "LICH::: SO you are lost....");
         System.out.println("LICH::: Well you see ... i hate people that a lost - so - goodbye"+ RESET);
         System.out.println(RED + "The fight has begun"+ RESET);
         LichFight.fight();

     }
       else if (command == 2) {

        }
        else if (command == 3) {

        }
     else if (command == 4) {

     }
    }
}
