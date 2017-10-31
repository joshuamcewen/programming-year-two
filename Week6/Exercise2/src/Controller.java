import java.util.HashMap;

public class Controller {
    public static void main(String[] args) {
        HashMap<String, String> phone = new HashMap<String, String>();
        phone.put("John", "3454");
        phone.put("Jenny", "3478");
        phone.put("Richard", "3567");
        phone.put("Helen", "4532");

        String name = "Jenny";
        String number = phone.get(name);
        System.out.println(name + ", " + number);
    }
}
