import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Created by Joshua on 21/11/2017.
 */
public class GetHomeHandler implements HttpHandler {
    public void handle(HttpExchange he) throws IOException {
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(he.getResponseBody()));
        he.sendResponseHeaders(200, 0);
        out.write("Server up and running.");
        out.close();
    }
}
