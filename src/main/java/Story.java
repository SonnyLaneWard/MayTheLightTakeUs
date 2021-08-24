import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Story {

public String number(int num_story)
{
    String s = null;
    switch (num_story){
        case (0) :
            try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\sin\\IdeaProjects\\MayTheLightTakeUs\\src\\main\\java\\BeginEn.txt")))
            {
               

                    s=br.readLine();



            }
            catch(IOException ex){

                System.out.println(ex.getMessage());
            }
            break;

        case (1) :
            try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\sin\\IdeaProjects\\MayTheLightTakeUs\\src\\main\\java\\BeginRu.txt")))
            {
               

                    s=br.readLine();


            }
            catch(IOException ex){

                System.out.println(ex.getMessage());
            }
            break;
        case (2) :
            try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\sin\\IdeaProjects\\MayTheLightTakeUs\\src\\main\\java\\BeginInit.txt")))
            {


                s=br.readLine();


            }
            catch(IOException ex){

                System.out.println(ex.getMessage());
            }
            break;
        default:
            throw new IllegalStateException("Unexpected value: " + num_story);
    }


    return s;
}






}
