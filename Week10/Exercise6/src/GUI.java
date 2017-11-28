import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * @author Joshua McEwen
 */
public class GUI extends JFrame {

    private Container frameContainer;

    public GUI() {
        super("Event Handling");
        frameContainer = new JFrame();

        JButton redBtn = new JButton("Red");
        JButton blueBtn = new JButton("Blue");


        redBtn.addMouseListener(new mouseEventListener());
        blueBtn.addMouseListener(new mouseEventListener());
    }

    private class mouseEventListener implements MouseListener {
        public void mouseEntered(MouseEvent me) {

        }
    }


}
