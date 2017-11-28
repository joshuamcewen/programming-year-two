import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * Created by Joshua on 21/11/2017.
 */
public class Controller {
    public static void main(String[] args) {
        try {
            HttpServer server = HttpServer.create(new InetSocketAddress(3000), 0);
            server.createContext("/info", new GetInfoHandler());
            server.createContext("/get", new GetParametersHandler());

            server.start();
            System.out.println("Server running ");
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
