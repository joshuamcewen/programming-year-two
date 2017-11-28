import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Joshua on 21/11/2017.
 */
public class GetParametersHandler implements HttpHandler {
    public void handle(HttpExchange he) throws IOException {
        StringBuilder response = new StringBuilder();

        Map<String, String> params = GetParametersHandler.queryToMap(he.getRequestURI().getQuery());

        response.append("<html><body>");
        response.append("Forename: " + params.get("firstname") + "<br>");
        response.append("Surname: " + params.get("lastname") + "<br>");
        response.append("</<body></html>");

        he.sendResponseHeaders(200, response.length());
        OutputStream os = he.getResponseBody();
        os.write(response.toString().getBytes());
        os.close();
    }

    public static Map<String, String> queryToMap(String query) {
        Map<String, String> result = new HashMap<String, String>();

        for(String param : query.split("&")) {
            String pair[] = param.split("=");

            if(pair.length > 1) {
                result.put(pair[0], pair[1]);
            } else {
                result.put(pair[0], "");
            }
        }

        return result;
    }
}
