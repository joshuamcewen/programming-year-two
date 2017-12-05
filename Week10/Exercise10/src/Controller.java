import javax.swing.*;

public class Controller {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                GUI f = new GUI();
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setSize(400, 200);
                f.setVisible(true);
            }
        });
    }
}
