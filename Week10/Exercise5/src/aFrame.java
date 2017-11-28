import javax.swing.*;
import java.awt.*;

/**
 * @author Joshua McEwen
 */
public class aFrame extends JFrame {
    public aFrame() {
        super("Common Swing Components");

        this.setLayout(new FlowLayout());

        JButton aButton = new JButton("Press me");
        JLabel aLabel = new JLabel("Enter Email");
        JTextField aTextField = new JTextField("Enter your email here");
        JCheckBox aCheckBox = new JCheckBox("Some Choice");

        String[] options = {"Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"};
        JComboBox aComboBox = new JComboBox(options);

        this.add(aButton);
        this.add(aLabel);
        this.add(aTextField);
        this.add(aCheckBox);
        this.add(aComboBox);
    }
}
