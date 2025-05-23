package JavaGUI.javalist;

import JavaGUI.SystemFrame;

import javax.swing.*;
import java.awt.*;

public class GridLayoutJava {
    public static void main(String[] args) {
        JFrame systemFrame = new JFrame();
        systemFrame.setTitle("Course List");
        systemFrame.setSize(800, 600);
        systemFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(2, 2, 10, 10));
        panel.setBackground(Color.WHITE);

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);


        systemFrame.add(panel);


        systemFrame.setLocationRelativeTo(null);
        systemFrame.setVisible(true);
    }
}
