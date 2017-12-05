import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImagePanel extends JPanel {
    private BufferedImage image;

    public ImagePanel(){
        try {
            image = ImageIO.read(new File("tux.png"));
        } catch(IOException e) {
            System.out.println("Cannot read image.");
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Graphics here
        g.drawImage(image, 0, 0, null);
    }
}