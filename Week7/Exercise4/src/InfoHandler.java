import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by Joshua on 14/11/2017.
 */
public class InfoHandler implements HttpHandler {
    public void handle(HttpExchange t) {
        try {
            String response = "Welcome to HttpServer.";
            t.sendResponseHeaders(200, response.length());
            OutputStream os = t.getResponseBody();
            os.write(response.getBytes());
            os.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
