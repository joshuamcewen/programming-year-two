/**
 * Created by Joshua on 28/11/2017.
 */
public class Controller {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                aFrame f = new aFrame();
            }
        });
    }
}
