import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PrintLich {

    public static void print()
    {
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\sin\\IdeaProjects\\MayTheLightTakeUs\\src\\main\\java\\LichAscii.txt")))
        {

            for (int i = 0;i < 20;i++)
            {
                String s = br.readLine();
                System.out.println(s);
            }


        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
