import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Joshua McEwen
 */
public class GUI extends JFrame {

    private JButton redBtn;
    private JButton blueBtn;

    public GUI() {
        super("Event Handling");

        this.setLayout(new FlowLayout());

        redBtn = new JButton("Red");
        blueBtn = new JButton("Blue");

        this.add(redBtn);
        this.add(blueBtn);


        redBtn.addActionListener(new mouseEventListener());
        blueBtn.addActionListener(new mouseEventListener());
    }

    private class mouseEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == redBtn) {
                getContentPane().setBackground(Color.RED);
            } else if(e.getSource() == blueBtn) {
                getContentPane().setBackground(Color.BLUE);
            }
        }
    }


}
