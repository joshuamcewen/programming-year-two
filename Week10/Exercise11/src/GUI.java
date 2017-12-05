import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {

    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenuItem newItem, openItem, saveItem, exitItem;

    private JFileChooser fcOpen = new JFileChooser();

    public GUI() {
        super("Exercise 11");

        menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);

        newItem = new JMenuItem("New");
        newItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // New file here
                newFile();
            }
        });

        openItem = new JMenuItem("Open");
        openItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open file here
                openFile();
            }
        });

        saveItem = new JMenuItem("Save");
        saveItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Save file here
                saveFile();
            }
        });

        exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // File menu
        fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 200);

    }

    public void newFile() {
        // New file
    }

    public void openFile() {
        // Open file

    }

    public void saveFile() {
        // Save file
    }
}
