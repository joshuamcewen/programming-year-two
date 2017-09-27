import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Controller {
    public static void main(String[] args)
    {
        FileReader file = null;
        BufferedReader fileInput = null;

        try
        {
            file = new FileReader("test.txt");
            fileInput = new BufferedReader(file);

            for(int i=0; i < 3; i++)
            {
                System.out.println(fileInput.readLine());
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try {
                fileInput.close();
                file.close();
            }
            catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
}
