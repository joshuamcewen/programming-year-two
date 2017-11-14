import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by Joshua on 14/11/2017.
 */
public class SocketDateClient {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 3000);
        BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));

        String currentDate = input.readLine();
        System.out.println("Date from server: " + currentDate);
    }
}
