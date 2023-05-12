package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {
    JFrame mainFrame;
    JLabel label;

    public GUI() {
        mainFrame = new JFrame();
        mainFrame.setLayout(new BorderLayout());
        label = new JLabel("En Producción");
        mainFrame.add(label, BorderLayout.CENTER);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}