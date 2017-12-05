public class Controller {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                GUI f = new GUI();
                f.setVisible(true);
            }
        });
    }
}
