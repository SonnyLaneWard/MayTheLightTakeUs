import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Dice {
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";

    public static int rollDice() throws InterruptedException {
        System.out.println(RED +"So the dice of luck is rolled.... ");
        TimeUnit.SECONDS.sleep(5);
        System.out.println("............................................. "+ RESET);
        TimeUnit.SECONDS.sleep(5);
        Random random = new Random();
        int num = random.nextInt(7);
        return num;

    }
     public static void printDice(int num)
     {
         System.out.println("You got" + num);

         if (num ==1)
         {
             System.out.println(RED + "-----");
             System.out.println("|   |");
             System.out.println("| o |");
             System.out.println("|   |");
             System.out.println("-----" + RESET);
         }
         if (num ==2)
         {
             System.out.println(RED + "-----");
             System.out.println("|o  |");
             System.out.println("|   |");
             System.out.println("|  o|");
             System.out.println("-----" + RESET);
         }
         if (num ==3)
         {
             System.out.println(RED + "-----");
             System.out.println("|o  |");
             System.out.println("| o |");
             System.out.println("|  o|");
             System.out.println("-----" + RESET);
         }
         if (num ==4)
         {
             System.out.println(RED + "-----");
             System.out.println("|o o|");
             System.out.println("|   |");
             System.out.println("|o o|");
             System.out.println("-----" + RESET);
         }
         if (num ==5)
         {
             System.out.println(RED + "-----");
             System.out.println("|o o|");
             System.out.println("| o |");
             System.out.println("|o o|");
             System.out.println("-----" + RESET);
         }
         if (num ==6)
         {
             System.out.println(RED + "-----");
             System.out.println("|o o|");
             System.out.println("|o o|");
             System.out.println("|o o|");
             System.out.println("-----" + RESET);
         }
     }





}
