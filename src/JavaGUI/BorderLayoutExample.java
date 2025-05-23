package JavaGUI;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample {
    JFrame frame;
    public static void main(String[] args) {
        BorderLayoutExample borderLayoutExample = new BorderLayoutExample();
        borderLayoutExample.show();

    }

    public BorderLayoutExample () {
        frame = new JFrame();
        frame.setLayout(new BorderLayout(5, 5));
        frame.setSize(800, 600);


        frame.add(new JButton("North"), BorderLayout.NORTH);
        frame.add(new JButton("South"), BorderLayout.SOUTH);
        frame.add(new JButton("East"), BorderLayout.EAST);
        frame.add(new JButton("West"), BorderLayout.WEST);
        frame.add(new JButton("Center"), BorderLayout.CENTER);
        frame.add(new JButton("North"), BorderLayout.NORTH);



        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void show() {
        frame.setVisible(true);
    }
}
