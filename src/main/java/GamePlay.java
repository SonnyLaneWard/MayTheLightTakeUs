import java.util.Scanner;
public class GamePlay {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Choose language");
        int choselanguage = in.nextInt();


        Story begin = new Story();
         System.out.println(begin.number(choselanguage));

    }
}
