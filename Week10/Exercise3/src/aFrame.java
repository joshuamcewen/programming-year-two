import javax.swing.*;
import java.awt.*;

/**
 * @author Joshua McEwen
 */

public class aFrame extends JFrame {

    public aFrame() {
        super("Exercise Three");
        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        JButton b4 = new JButton("Button 4");
        JButton b5 = new JButton("Button 5");
        JButton b6 = new JButton("Button 6");

        this.setLayout(new GridLayout(0,2));

        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.add(b5);
        this.add(b6);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 200);
        this.setVisible(true);
    }
}