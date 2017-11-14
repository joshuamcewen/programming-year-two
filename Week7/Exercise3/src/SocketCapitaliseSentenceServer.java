import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Joshua on 14/11/2017.
 */
public class SocketCapitaliseSentenceServer {
    public static void main(String[] args) throws IOException {
        String clientSentence;
        String capitalisedSentence;

        ServerSocket serverSocket = null;
        Socket connectionSocket = null;

        try {
            serverSocket = new ServerSocket(3001);
            System.out.println("Server open on port 3001.");

            while(true) {
                connectionSocket = serverSocket.accept();
                BufferedReader inClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
                DataOutputStream outClient = new DataOutputStream(connectionSocket.getOutputStream());

                clientSentence = inClient.readLine();
                System.out.println("Received: " + clientSentence);
                capitalisedSentence = clientSentence.toUpperCase() + '\n';

                outClient.writeBytes(capitalisedSentence);
            }
        } catch(IOException e) {
            System.out.println(e.getMessage());
        } finally {
            connectionSocket.close();
            serverSocket.close();
        }
    }
}
