import java.util.ArrayList;

public class Controller {
    public static void main(String[] args) {
        ArrayList<String> insects = new ArrayList<String>();
        insects.add("Horsefly");
        insects.add("Butterfly");
        insects.add("Dragonfly");
        insects.add("Fly");

        for(String i : insects) {
            System.out.println(i);
        }
    }
}
