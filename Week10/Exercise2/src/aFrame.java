import javax.swing.*;
import java.awt.*;

/**
 * Created by Joshua on 28/11/2017.
 */
public class aFrame extends JFrame {

    public aFrame() {
        super("Exercise Two");
        JButton b1 = new JButton("Button NORTH");
        JButton b2 = new JButton("Button EAST");
        JButton b3 = new JButton("Button SOUTH");
        JButton b4 = new JButton("Button WEST");
        JButton b5 = new JButton("Button CENTRAL");

        this.setLayout(new BorderLayout());

        this.getContentPane().add(b1, BorderLayout.NORTH);
        this.getContentPane().add(b2, BorderLayout.EAST);
        this.getContentPane().add(b3, BorderLayout.SOUTH);
        this.getContentPane().add(b4, BorderLayout.WEST);
        this.getContentPane().add(b5, BorderLayout.CENTER);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 200);
        this.setVisible(true);
    }
}
