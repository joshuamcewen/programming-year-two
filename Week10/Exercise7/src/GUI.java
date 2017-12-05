import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Joshua McEwen
 */
public class GUI extends JFrame {
    JButton parseBtn;
    JButton clearBtn;
    JTextField nameField;

    public GUI() {
        super("Parsing");
        setLayout(new FlowLayout());

        parseBtn = new JButton("Display Name");
        clearBtn = new JButton("Clear");

        nameField = new JTextField("");

        add(parseBtn);
        add(clearBtn);
        add(nameField);

        parseBtn.addActionListener(new ParseListener());
        clearBtn.addActionListener(new ParseListener());
    }

    private class ParseListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == parseBtn) {
                nameField.setText("Josh");
            } else if (e.getSource() == clearBtn) {
                nameField.setText("");
            }
        }
    }
}
