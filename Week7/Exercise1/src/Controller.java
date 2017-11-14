import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Joshua on 14/11/2017.
 */
public class Controller {
    public static void main(String[] args) throws IOException {
        URL url = null;
        BufferedReader in = null;

        try {
            url = new URL("http://www2.mmu.ac.uk");
            in = new BufferedReader(new InputStreamReader(url.openStream()));

            String inputLine;

            while((inputLine = in.readLine()) != null){
                System.out.println(inputLine);
            }
        } catch(MalformedURLException e) {
            System.out.println("Malformed URL: " + e.getMessage());
        } catch(IOException e) {
            System.out.println("Connection error: " + e.getMessage());
        } finally {
            in.close();
        }
    }
}
