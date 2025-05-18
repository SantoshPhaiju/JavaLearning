package JavaGUI;

import javax.swing.*;

public class SwingEx {
    public static void main(String[] args) {


        JFrame frame = new JFrame();
        frame.setTitle("Student Management System");
        JButton button = new JButton("Click Me");
        frame.add(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);

    }
}
