import javax.swing.*;
import java.awt.*;

/**
 * Created by Joshua on 28/11/2017.
 */
public class aFrame extends JFrame {

    public aFrame() {
        super("Exercise One");
        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        JButton b4 = new JButton("Button 4");
        JButton b5 = new JButton("Button 5");
        JButton b6 = new JButton("Button 6");

        this.setLayout(new FlowLayout());

        this.getContentPane().add(b1);
        this.getContentPane().add(b2);
        this.getContentPane().add(b3);
        this.getContentPane().add(b4);
        this.getContentPane().add(b5);
        this.getContentPane().add(b6);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 200);
        this.setVisible(true);
    }
}
