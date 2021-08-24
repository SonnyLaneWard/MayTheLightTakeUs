import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Story {

public String number(int num_story)
{
    String s = null;
    switch (num_story){
        case (10) :
            try(BufferedReader br = new BufferedReader(new FileReader("BeginEn.txt")))
            {
                while((s=br.readLine())!=null){
                    s=br.readLine();

                }
            }
            catch(IOException ex){

                System.out.println(ex.getMessage());
            }
            break;

        case (11) :
            try(BufferedReader br = new BufferedReader(new FileReader("BeginRu.txt")))
            {
                while((s=br.readLine())!=null){
                    s=br.readLine();

                }
            }
            catch(IOException ex){

                System.out.println(ex.getMessage());
            }
            break;
    }

    return s;
}






}
