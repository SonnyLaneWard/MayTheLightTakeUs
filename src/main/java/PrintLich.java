import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class PrintLich {
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";

    public static void print()
    {
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\sin\\IdeaProjects\\MayTheLightTakeUs\\src\\main\\java\\LichAscii.txt")))
        {

            for (int i = 0;i < 18;i++)
            {
                String s = br.readLine();
                System.out.println(s);
                TimeUnit.SECONDS.sleep(1);
            }


        }
        catch(IOException | InterruptedException ex){

            System.out.println(ex.getMessage());
        }
    }
    public static void printdead()
    {
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\sin\\IdeaProjects\\MayTheLightTakeUs\\src\\main\\java\\LichAscii.txt")))
        {

            for (int i = 0;i < 11;i++)
            {
                String s = br.readLine();
                System.out.println(s);
            }
          System.out.println(RED + "DEAD DEAD DEAD DEAD DEAD");
            System.out.println(RED + "DEAD DEAD DEAD DEAD DEAD" + RESET);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
