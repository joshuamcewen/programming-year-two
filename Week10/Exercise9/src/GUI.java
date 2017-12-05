import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Joshua McEwen
 */
public class GUI extends JFrame {
    JComboBox colourList;
    JLabel outputText;

    public GUI() {
        super("Parsing");
        setLayout(new FlowLayout());

        String[] options = {"Red", "Yellow", "Pink", "Blue"};

        colourList = new JComboBox(options);
        outputText = new JLabel("");

        add(colourList);
        add(outputText);

        colourList.addActionListener(new ComboListener());
    }

    private class ComboListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            outputText.setText((String) colourList.getSelectedItem());
        }
    }
}
