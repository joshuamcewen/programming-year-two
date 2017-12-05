import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Graphics here
        g.setColor(new Color(255, 0, 0));
        g.drawLine(0,0,200,200);

        g.setColor(new Color(0, 0, 0));
        Font aFont = new Font("TimesRoman", Font.BOLD, 20);
        g.setFont(aFont);
        g.drawString("Hello Java Graphics World", 50, 50);
    }
}
