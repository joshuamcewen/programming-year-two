import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * Created by Joshua on 14/11/2017.
 */
public class Controller {
    public static void main(String[] args) {
        try {
            HttpServer server = HttpServer.create(new InetSocketAddress(3000), 0);

            // Routes
            server.createContext("/", new GetHomeHandler());
            server.createContext("/get-date", new GetDateHandler());

            server.setExecutor(null);
            server.start();

            System.out.println("Server started on port 3000.");
        } catch(IOException e) {
            System.out.println("Connection error: " + e.getMessage());
        }
    }
}
