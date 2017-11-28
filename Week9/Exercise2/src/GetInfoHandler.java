import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Created by Joshua on 21/11/2017.
 */
public class GetInfoHandler implements HttpHandler {
    public void handle(HttpExchange he) throws IOException {
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(he.getResponseBody()));
        he.sendResponseHeaders(200, 0);
        out.write("Use /get?firstname=Josh&lastname=McEwen to demo URL parameters.");
        out.close();
    }
}
