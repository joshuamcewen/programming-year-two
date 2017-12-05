import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {

    JButton btnFirstName;
    JButton btnLastName;
    JButton btnFullName;

    String firstName;
    String lastName;
    String fullName;

    public GUI() {
        super("JOptionPane Example");
        setLayout(new FlowLayout());

        btnFirstName = new JButton("Enter first name");
        btnLastName = new JButton("Enter last name");
        btnFullName = new JButton("Display full name");

        add(btnFirstName);
        add(btnLastName);
        add(btnFullName);

        btnFirstName.addActionListener(new ButtonHandler());
        btnLastName.addActionListener(new ButtonHandler());
        btnFullName.addActionListener(new ButtonHandler());
    }

    private class ButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == btnFirstName) {
                firstName = JOptionPane.showInputDialog(null, "Enter first name.");
                fullName = firstName + " " + lastName;
            } else if (e.getSource() == btnLastName) {
                lastName = JOptionPane.showInputDialog(null, "Enter first name.");
                fullName = firstName + " " + lastName;
            } else if(e.getSource() == btnFullName) {
                JOptionPane.showMessageDialog(null, "Full name: " + fullName, "Full name", JOptionPane.PLAIN_MESSAGE);
            }
        }
    }
}
