import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * @author Joshua McEwen
 */

public class aFrame extends JFrame {

    private JLabel aLabel;
    private JPanel aPanel;
    private Container frameContainer;

    public aFrame() {
        super("Exercise Four");
        aLabel = new JLabel("");
        aLabel.setBackground(Color.WHITE);
        aPanel = new JPanel();
        aPanel.setBackground(Color.YELLOW);

        frameContainer = this.getContentPane();
        frameContainer.setLayout(new BorderLayout());

        frameContainer.add(aPanel, BorderLayout.CENTER);
        frameContainer.add(aLabel, BorderLayout.SOUTH);

        mouseEventHandler m = new mouseEventHandler();
        aPanel.addMouseListener(m);
        aPanel.addMouseMotionListener(m);
    }

    private class mouseEventHandler extends JFrame implements MouseListener, MouseMotionListener {
        public void mouseClicked(MouseEvent e) {
            aLabel.setText("Clicked");

        }

        public void mouseEntered(MouseEvent e) {
            aLabel.setText("Entered");
        }

        public void mouseExited(MouseEvent e) {
            aLabel.setText("Exited");
        }

        public void mousePressed(MouseEvent e) {
            aLabel.setText("Pressed");
        }

        public void mouseReleased(MouseEvent e) {
            aLabel.setText("Released");
        }

        public void mouseMoved(MouseEvent e) {
            aLabel.setText("Moved");
        }

        public void mouseDragged(MouseEvent e) {
            aLabel.setText("Dragged");
        }
    }
}
