import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * @author Joshua McEwen
 */
public class ParsingController {
    public static void main(String[] args) {
        String myJson = "[{\"name\":\"Mohammed Kaleem\",\"email\":\"m.kaleem@mmu.ac.uk\"},{\"name\":\"Alan Crispin\",\"email\":\"a.crispin@mmu.ac.uk\"},{\"name\":\"Keeley Crockett\",\"email\":\"k.crockett@mmu.ac.uk\"}]\r\n";

        JsonParser jsonParser = new JsonParser();
        System.out.println(myJson);

        JsonArray empsArray = jsonParser.parse(myJson).getAsJsonArray();
        System.out.println("JSON array size: " + empsArray.size());

        for(JsonElement je : empsArray) {
            JsonObject emp = je.getAsJsonObject();
            String name = emp.get("name").getAsString();
            String email = emp.get("email").getAsString();

            System.out.println("Name: " + name + ", email: " + email);
        }
    }
}
