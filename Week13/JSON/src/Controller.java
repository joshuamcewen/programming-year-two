import com.google.gson.Gson;

import java.util.ArrayList;

/**
 * @author Joshua McEwen
 */
public class Controller {
    public static void main(String[] args) {
        Gson gson = new Gson();
        ArrayList<Contact> contacts = new ArrayList<>();

        Contact kaleem = new Contact("Mohammed Kaleem", "m.kaleem@mmu.ac.uk");
        Contact alan = new Contact("Alan Crispin", "a.crispin@mmu.ac.uk");
        Contact keeley = new Contact("Keeley Crockett", "k.crockett@mmu.ac.uk");
        Contact josh = new Contact("Joshua McEwen", "16012396@stu.mmu.ac.uk");

        contacts.add(kaleem);
        contacts.add(alan);
        contacts.add(keeley);
        contacts.add(josh);

        String outputJSON = gson.toJson(contacts);
        System.out.println(outputJSON);
    }
}
