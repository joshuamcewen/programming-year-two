import com.sun.net.httpserver.HttpServer;

import java.net.InetSocketAddress;

/**
 * Created by Joshua on 14/11/2017.
 */
public class Controller {
    public static void main(String args[]) {
        try {
            HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
            server.createContext("/info", new InfoHandler());
            server.setExecutor(null);
            server.start();
            System.out.println("Server is running on port 8000.");
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
