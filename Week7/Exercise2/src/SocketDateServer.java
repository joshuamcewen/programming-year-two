import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 * Created by Joshua on 14/11/2017.
 */
public class SocketDateServer {
    public static void main(String[] args) throws IOException {
        System.out.println("Server running on port 3000.");
        ServerSocket listener = new ServerSocket(3000);

        try {
            while(true) {
                Socket socket = listener.accept();

                try {
                    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                    out.println(new Date().toString());
                } finally {
                    socket.close();
                }
            }
        } finally {
            listener.close();
        }
    }
}
