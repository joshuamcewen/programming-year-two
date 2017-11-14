import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by Joshua on 14/11/2017.
 */
public class SocketCapitaliseSentenceClient {
    public static void main(String[] args) throws Exception {
        String sentence;
        String modifiedSentence;

        System.out.println("Please enter some text > ");

        BufferedReader inUser = new BufferedReader(new InputStreamReader(System.in));
        Socket clientSocket = new Socket("localhost", 3001);

        DataOutputStream outServer = new DataOutputStream(clientSocket.getOutputStream());
        BufferedReader inServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        sentence = inUser.readLine();
        outServer.writeBytes(sentence + '\n');

        modifiedSentence = inServer.readLine();
        System.out.println("Incoming from server: " + modifiedSentence);

        clientSocket.close();
    }
}
