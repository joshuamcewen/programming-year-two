import javax.swing.*;

/**
 * @author Joshua McEwen
 */
public class Controller {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                GUI f = new GUI();
                f.setSize(400, 200);
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setVisible(true);
            }
        });
    }
}