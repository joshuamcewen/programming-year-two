import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Joshua McEwen
 */
public class GUI extends JFrame {
    JCheckBox checkBox;
    JLabel message;

    public GUI() {
        super("Parsing");
        setLayout(new FlowLayout());

        checkBox = new JCheckBox("Choice");
        message = new JLabel("Tick box.");

        add(checkBox);
        add(message);

        checkBox.addActionListener(new BoxListener());
    }

    private class BoxListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(checkBox.isSelected()) {
                message.setText("Ticked");
            } else {
                message.setText("Unticked");
            }
        }
    }
}
